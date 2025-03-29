package com.noxmor.terranite.item;

import com.noxmor.terranite.Terranite;
import com.noxmor.terranite.enchantment.ModEnchantments;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Terranite.ID);

    public static final RegistryObject<CreativeModeTab> TERRANITE_TAB = CREATIVE_MODE_TABS.register(
            "terranite_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Items.GRASS_BLOCK))
                    .title(Component.translatable("creativetab.terranite_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.HORSE_ARMOR_BASE.get());
                        pOutput.accept(ModItems.NETHERITE_HORSE_ARMOR.get());
                        pOutput.accept(ModItems.TERRANITE_INGOT.get());
                        pOutput.accept(ModItems.TERRANITE_HELMET.get());
                        pOutput.accept(ModItems.TERRANITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.TERRANITE_LEGGINGS.get());
                        pOutput.accept(ModItems.TERRANITE_BOOTS.get());
                        pOutput.accept(EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.FLY_ENCHANTMENT.get(), 1)));
                    })
                    .build());

    public static void register(final IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
