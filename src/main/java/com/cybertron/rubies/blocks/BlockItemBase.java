package com.cybertron.rubies.blocks;

import com.cybertron.rubies.rubies;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(rubies.TAB));
    }
}
