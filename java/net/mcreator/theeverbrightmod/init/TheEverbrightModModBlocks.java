
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theeverbrightmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.theeverbrightmod.block.TwilightLogBlock;
import net.mcreator.theeverbrightmod.block.JasperBlock;
import net.mcreator.theeverbrightmod.block.EverbrightOreBlock;
import net.mcreator.theeverbrightmod.block.EverbrightDimensionPortalBlock;
import net.mcreator.theeverbrightmod.TheEverbrightModMod;

public class TheEverbrightModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, TheEverbrightModMod.MODID);
	public static final DeferredHolder<Block, Block> JASPER = REGISTRY.register("jasper", () -> new JasperBlock());
	public static final DeferredHolder<Block, Block> TWILIGHT_LOG = REGISTRY.register("twilight_log", () -> new TwilightLogBlock());
	public static final DeferredHolder<Block, Block> EVERBRIGHT_ORE = REGISTRY.register("everbright_ore", () -> new EverbrightOreBlock());
	public static final DeferredHolder<Block, Block> EVERBRIGHT_DIMENSION_PORTAL = REGISTRY.register("everbright_dimension_portal", () -> new EverbrightDimensionPortalBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
