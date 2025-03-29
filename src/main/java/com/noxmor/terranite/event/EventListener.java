package com.noxmor.terranite.event;

import com.noxmor.terranite.Config;
import com.noxmor.terranite.Terranite;
import com.noxmor.terranite.enchantment.ModEnchantments;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ElytraItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityMobGriefingEvent;
import net.minecraftforge.event.level.ExplosionEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Terranite.ID)
public class EventListener
{
    @SubscribeEvent
    public static void onCreeperExplosionStart(ExplosionEvent.Start event)
    {
        if(!Config.disableCreeperExplosions)
            return;

        if(event.getExplosion().getDirectSourceEntity() instanceof Creeper)
            event.setCanceled(true);
    }

    @SubscribeEvent
    public static void onEnderManPickup(EntityMobGriefingEvent event)
    {
        if(!Config.disableEnderManBlockPickup)
            return;

        if(event.getEntity() instanceof EnderMan)
            event.setResult(Event.Result.DENY);
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event)
    {
        final Player player = event.player;

        if (player.level().isClientSide)
        {
            return;
        }

        final ItemStack elytra = player.getItemBySlot(EquipmentSlot.CHEST);

        if (elytra.getItem() instanceof ElytraItem &&
                EnchantmentHelper.getEnchantmentLevel(ModEnchantments.FLY_ENCHANTMENT.get(), player) > 0)
        {
            player.getAbilities().mayfly = true;

            if (!player.isCreative() && player.getAbilities().flying && player.tickCount % 20 == 0)
            {
                elytra.hurtAndBreak(1, player, EquipmentSlot.CHEST);
            }

            player.onUpdateAbilities();
        }
        else
        {
            if (!player.isCreative())
            {
                player.getAbilities().mayfly = false;
                player.getAbilities().flying = false;
                player.onUpdateAbilities();
            }
        }
    }
}
