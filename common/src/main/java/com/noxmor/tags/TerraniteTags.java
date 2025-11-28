package com.noxmor.tags;

import com.noxmor.Terranite;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class TerraniteTags {

    public static final TagKey<Item> TERRANITE_TOOL_MATERIALS =
        TagKey.create(Registries.Item, ResourceLocation.fromNamespaceAndPath(
                    Terranite.MOD_ID, "terranite_tool_materials"));

    public static final TagKey<Item> REPAIRS_TERRANITE_ARMOR =
        TagKey.create(Registries.Item, ResourceLocation.fromNamespaceAndPath(
                    Terranite.MOD_ID, "repairs_terranite_armor"));
}
