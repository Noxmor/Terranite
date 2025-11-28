package com.noxmor.items;

import com.noxmor.Terranite;
import com.noxmor.tabs.TerraniteTabs;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Supplier;

public class TerraniteItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Terranite.MOD_ID, Registries.ITEM);

    private static RegistrySupplier<Item> TERRANITE_INGOT =
        registerItem("terranite_ingot", () -> new Item(baseProperties(
                        "terranite_ingot").arch$tab(TerraniteTabs.TERRANITE_TAB)));

    private static final RegistrySupplier<Item> TERRANITE_HELMET =
        registerItem("terranite_helmet", () -> new ArmorItem(
                    TerraniteArmorMaterials.TERRANITE, ArmorType.HELMET, baseProperties(
                        "terranite_helmet").arch$tab(TerraniteTabs.TERRANITE_TAB)));

    private static final RegistrySupplier<Item> TERRANITE_CHESTPLATE =
        registerItem("terranite_chestplate", () -> new ArmorItem(
                    TerraniteArmorMaterials.TERRANITE, ArmorType.CHESTPLATE, baseProperties(
                        "terranite_chestplate").arch$tab(TerraniteTabs.TERRANITE_TAB)));

    private static final RegistrySupplier<Item> TERRANITE_LEGGINGS =
        registerItem("terranite_leggings", () -> new ArmorItem(
                    TerraniteArmorMaterials.TERRANITE, ArmorType.LEGGINGS, baseProperties(
                        "terranite_leggings").arch$tab(TerraniteTabs.TERRANITE_TAB)));

    private static final RegistrySupplier<Item> TERRANITE_BOOTS =
        registerItem("terranite_boots", () -> new ArmorItem(
                    TerraniteArmorMaterials.TERRANITE, ArmorType.BOOTS, baseProperties(
                        "terranite_boots").arch$tab(TerraniteTabs.TERRANITE_TAB)));

    private static final RegistrySupplier<Item> TERRANITE_SWORD =
        registerItem("terranite_sword", () -> new SwordItem(
                    TerraniteToolMaterials.TERRANITE, 4.5f, -2.5f, baseProperties(
                        "terranite_sword").arch$tab(TerraniteTabs.TERRANITE_TAB)));

    private static final RegistrySupplier<Item> TERRANITE_PICKAXE =
        registerItem("terranite_pickaxe", () -> new PickaxeItem(
                    TerraniteToolMaterials.TERRANITE, 4.5f, -2.5f, baseProperties(
                        "terranite_pickaxe").arch$tab(TerraniteTabs.TERRANITE_TAB)));

    private static final RegistrySupplier<Item> TERRANITE_SHOVEL =
        registerItem("terranite_shovel", () -> new ShovelItem(
                    TerraniteToolMaterials.TERRANITE, 4.5f, -2.5f, baseProperties(
                        "terranite_shovel").arch$tab(TerraniteTabs.TERRANITE_TAB)));

    private static final RegistrySupplier<Item> TERRANITE_AXE =
        registerItem("terranite_axe", () -> new AxeItem(
                    TerraniteToolMaterials.TERRANITE, 4.5f, -2.5f, baseProperties(
                        "terranite_axe").arch$tab(TerraniteTabs.TERRANITE_TAB)));

    private static final RegistrySupplier<Item> TERRANITE_HOE =
        registerItem("terranite_hoe", () -> new HoeItem(
                    TerraniteToolMaterials.TERRANITE, 4.5f, -2.5f, baseProperties(
                        "terranite_hoe").arch$tab(TerraniteTabs.TERRANITE_TAB)));

    private static final RegistrySupplier<Item> HORSE_ARMOR_BASE =
        registerItem("horse_armor_base", () -> new Item(baseProperties(
                        "horse_armor_base").arch$tab(TerraniteTabs.TERRANITE_TAB)));

    private static final RegistrySupplier<Item> NETHERITE_HORSE_ARMOR =
        registerItem("netherite_horse_armor", () -> new Item(baseProperties(
                        "netherite_horse_armor").arch$tab(TerraniteTabs.TERRANITE_TAB)));

    private static final RegistrySupplier<Item> TERRANITE_HORSE_ARMOR =
        registerItem("terranite_horse_armor", () -> new Item(baseProperties(
                        "terranite_horse_armor").arch$tab(TerraniteTabs.TERRANITE_TAB)));

    public static void init() {
        ITEMS.register();
    }

    private static RegistrySupplier<Item> registerItem(final String name, final Supplier<Item> item) {
        return ITEMS.register(ResourceLocation.fromNamespaceAndPath(Terranite.MOD_ID, name), item);
    }

    private static Item.Properties baseProperties(final String name) {
        return new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Terranite.MOD_ID, name)));
    }
}
