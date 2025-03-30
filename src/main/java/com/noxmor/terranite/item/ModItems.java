package com.noxmor.terranite.item;

import com.noxmor.terranite.Terranite;
import com.noxmor.terranite.item.TerraniteTier;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> TERRANITE_INGOT = ITEMS.register("terranite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TERRANITE_HELMET = ITEMS.register("terranite_helmet",
            () -> new ArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.HELMET,
                    new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TERRANITE_CHESTPLATE = ITEMS.register("terranite_chestplate",
            () -> new ArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TERRANITE_LEGGINGS = ITEMS.register("terranite_leggings",
            () -> new ArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TERRANITE_BOOTS = ITEMS.register("terranite_boots",
            () -> new ArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS,
                    new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> TERRANITE_SWORD = ITEMS.register("terranite_sword",
            () -> new SwordItem(TerraniteTier.INSTANCE, new Item.Properties().attributes(SwordItem.createAttributes(TerraniteTier.INSTANCE, 3, -2.4f))));

    public static final RegistryObject<Item> TERRANITE_PICKAXE = ITEMS.register("terranite_pickaxe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TERRANITE_SHOVEL = ITEMS.register("terranite_shovel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TERRANITE_AXE = ITEMS.register("terranite_axe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TERRANITE_HOE = ITEMS.register("terranite_hoe",
            () -> new Item(new Item.Properties()));

    public static void register(final IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
