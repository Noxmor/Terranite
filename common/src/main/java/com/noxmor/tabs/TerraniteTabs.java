package com.noxmor.tabs;

import com.noxmor.Terranite;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class TerraniteTabs {

    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Terranite.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> TERRANITE_TAB =
        TABS.register("terranite_tab", () -> CreativeTabRegistry.create(
                    Component.translatable("category.terranite_tab"),
                        () -> new ItemStack(Items.GRASS_BLOCK)));

    public static void init() {
        TABS.register();
    }
}
