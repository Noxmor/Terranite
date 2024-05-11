package com.noxmor.terranite.item;

import com.noxmor.terranite.Terranite;
import net.minecraft.world.item.AnimalArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Terranite.ID);

    public static final RegistryObject<Item> HORSE_ARMOR_BASE = ITEMS.register("horse_armor_base",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_HORSE_ARMOR = ITEMS.register("netherite_horse_armor",
            () -> new AnimalArmorItem(ArmorMaterials.NETHERITE, AnimalArmorItem.BodyType.EQUESTRIAN, false,
                    new Item.Properties().stacksTo(1)));

    public static void register(final IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
