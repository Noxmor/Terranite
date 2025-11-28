package com.noxmor.items.equipment;

import com.noxmor.Terranite;
import com.noxmor.tags.TerraniteTags;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.Map;

public class TerraniteArmorMaterials {

    private static final ResourceKey<EquipmentAsset> TERRANITE_ARMOR_MATERIAL_KEY =
        ResourceKey.create(EquipmentAssets.ROOT_ID,
                ResourceLocation.fromNamespaceAndPath(Terranite.MOD_ID, "terranite"));

    private static final ArmorMaterial TERRANITE = new ArmorMaterial(64,
            Map.of(
                ArmorType.HELMET, 3,
                ArmorType.CHESTPLATE, 8,
                ArmorType.LEGGINGS, 6,
                ArmorType.BOOTS, 3
                ),
            14, SoundEvents.ARMOR_EQUIP_NETHERITE, 2.0f, 0.0f,
            TerraniteTags.REPAIRS_TERRANITE_ARMOR, TERRANITE_ARMOR_MATERIAL_KEY);
}
