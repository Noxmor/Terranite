package com.noxmor.terranite.item;

import com.noxmor.terranite.Terranite;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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
                        pOutput.accept(Items.DIAMOND);
                    })
                    .build());

    public static void register(final IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
