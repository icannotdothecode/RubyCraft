package com.cybertron.rubies.util;

import com.cybertron.rubies.blocks.RubyOre;
import com.cybertron.rubies.rubies;
import com.cybertron.rubies.blocks.BlockItemBase;
import com.cybertron.rubies.blocks.RubyBlock;
import com.cybertron.rubies.items.ItemBase;
import com.cybertron.rubies.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.AxeItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, rubies.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, rubies.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    // ITEMS
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    // BLOCKS
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
    // BLOCK ITEMS
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));
    // TOOLS
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ModItemTier.RUBY, 4, 0.5F, new Item.Properties()
                    .group(rubies.TAB)
            ));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ModItemTier.RUBY, 1, 0.4F, new Item.Properties()
                    .group(rubies.TAB)
            ));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(ModItemTier.RUBY, 5, 0.9F, new Item.Properties()
                    .group(rubies.TAB)
            ));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(ModItemTier.RUBY, 1, 0.3F, new Item.Properties()
                    .group(rubies.TAB)
            ));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new HoeItem(ModItemTier.RUBY, 1, new Item.Properties()
                    .group(rubies.TAB)
            ));

}
