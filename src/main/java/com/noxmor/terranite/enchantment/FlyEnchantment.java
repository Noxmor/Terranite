package com.noxmor.terranite.enchantment;

import com.noxmor.terranite.Terranite;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.enchantment.Enchantment;

import java.util.Optional;

public class FlyEnchantment extends Enchantment
{
    public FlyEnchantment()
    {
        super(new EnchantmentDefinition(TagKey.create(Registries.ITEM,
                new ResourceLocation(Terranite.ID, "enchantable/fly")), Optional.empty(),
                10, 1, new Cost(5, 2), new Cost(5, 2), 5,
                FeatureFlagSet.of(), new EquipmentSlot[]{EquipmentSlot.CHEST}));
    }
}
