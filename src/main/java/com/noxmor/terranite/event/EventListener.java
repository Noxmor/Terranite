package com.noxmor.terranite.event;

import com.noxmor.terranite.Config;
import com.noxmor.terranite.Terranite;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.EnderMan;
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
}
