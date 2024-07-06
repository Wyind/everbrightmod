
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theeverbrightmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.theeverbrightmod.item.TemplefrogItem;
import net.mcreator.theeverbrightmod.item.EverbrightSwordItem;
import net.mcreator.theeverbrightmod.item.EverbrightShovelItem;
import net.mcreator.theeverbrightmod.item.EverbrightSheetItem;
import net.mcreator.theeverbrightmod.item.EverbrightPickaxeItem;
import net.mcreator.theeverbrightmod.item.EverbrightIngotItem;
import net.mcreator.theeverbrightmod.item.EverbrightHoeItem;
import net.mcreator.theeverbrightmod.item.EverbrightHelmetItem;
import net.mcreator.theeverbrightmod.item.EverbrightDustItem;
import net.mcreator.theeverbrightmod.item.EverbrightDimensionItem;
import net.mcreator.theeverbrightmod.item.EverbrightAxeItem;
import net.mcreator.theeverbrightmod.TheEverbrightModMod;

public class TheEverbrightModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, TheEverbrightModMod.MODID);
	public static final DeferredHolder<Item, Item> JASPER = block(TheEverbrightModModBlocks.JASPER);
	public static final DeferredHolder<Item, Item> EVERBRIGHT_DUST = REGISTRY.register("everbright_dust", () -> new EverbrightDustItem());
	public static final DeferredHolder<Item, Item> EVERBRIGHT_INGOT = REGISTRY.register("everbright_ingot", () -> new EverbrightIngotItem());
	public static final DeferredHolder<Item, Item> EVERBRIGHT_SWORD = REGISTRY.register("everbright_sword", () -> new EverbrightSwordItem());
	public static final DeferredHolder<Item, Item> EVERBRIGHT_PICKAXE = REGISTRY.register("everbright_pickaxe", () -> new EverbrightPickaxeItem());
	public static final DeferredHolder<Item, Item> EVERBRIGHT_AXE = REGISTRY.register("everbright_axe", () -> new EverbrightAxeItem());
	public static final DeferredHolder<Item, Item> EVERBRIGHT_SHOVEL = REGISTRY.register("everbright_shovel", () -> new EverbrightShovelItem());
	public static final DeferredHolder<Item, Item> EVERBRIGHT_HELMET_HELMET = REGISTRY.register("everbright_helmet_helmet", () -> new EverbrightHelmetItem.Helmet());
	public static final DeferredHolder<Item, Item> EVERBRIGHT_HELMET_CHESTPLATE = REGISTRY.register("everbright_helmet_chestplate", () -> new EverbrightHelmetItem.Chestplate());
	public static final DeferredHolder<Item, Item> EVERBRIGHT_HELMET_LEGGINGS = REGISTRY.register("everbright_helmet_leggings", () -> new EverbrightHelmetItem.Leggings());
	public static final DeferredHolder<Item, Item> EVERBRIGHT_HELMET_BOOTS = REGISTRY.register("everbright_helmet_boots", () -> new EverbrightHelmetItem.Boots());
	public static final DeferredHolder<Item, Item> EVERBRIGHT_HOE = REGISTRY.register("everbright_hoe", () -> new EverbrightHoeItem());
	public static final DeferredHolder<Item, Item> EVERBRIGHT_SHEET = REGISTRY.register("everbright_sheet", () -> new EverbrightSheetItem());
	public static final DeferredHolder<Item, Item> TWILIGHT_LOG = block(TheEverbrightModModBlocks.TWILIGHT_LOG);
	public static final DeferredHolder<Item, Item> EVERBRIGHT_ORE = block(TheEverbrightModModBlocks.EVERBRIGHT_ORE);
	public static final DeferredHolder<Item, Item> TEMPLEFROG = REGISTRY.register("templefrog", () -> new TemplefrogItem());
	public static final DeferredHolder<Item, Item> EVERBRIGHT_DIMENSION = REGISTRY.register("everbright_dimension", () -> new EverbrightDimensionItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
