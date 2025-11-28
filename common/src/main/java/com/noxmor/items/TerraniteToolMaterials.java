package com.noxmor.items;

import com.noxmor.tags.TerraniteTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class TerraniteToolMaterials {

    private static final ToolMaterial TERRANITE = new ToolMaterial(
        BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4096, 10.0f, 2.0f, 14,
        TerraniteTags.TERRANITE_TOOL_MATERIAL
    );
}
