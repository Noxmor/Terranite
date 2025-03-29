package com.noxmor.terranite.enchantment;

import com.noxmor.terranite.Terranite;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments
{
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Terranite.ID);

    public static final RegistryObject<Enchantment> FLY_ENCHANTMENT = ENCHANTMENTS.register("fly", FlyEnchantment::new);

    public static void register(final IEventBus eventBus)
    {
        ENCHANTMENTS.register(eventBus);
    }
}
