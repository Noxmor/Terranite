package com.noxmor.terranite.item;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public class TerraniteTier implements Tier
{
    public static final TerraniteTier INSTANCE = new TerraniteTier();

    @Override
    public int getUses()
    {
        return 3000;
    }

    @Override
    public float getSpeed()
    {
        return 10.0f;
    }

    @Override
    public float getAttackDamageBonus()
    {
        return 10.0f;
    }

    @Override
    public int getEnchantmentValue()
    {
        return 15;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops()
    {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.of();
    }
}
