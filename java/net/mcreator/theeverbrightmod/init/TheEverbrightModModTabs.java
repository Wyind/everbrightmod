
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theeverbrightmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.theeverbrightmod.TheEverbrightModMod;

public class TheEverbrightModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheEverbrightModMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> THE_EVERBRIGHT_MOD = REGISTRY.register("the_everbright_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_everbright_mod.the_everbright_mod")).icon(() -> new ItemStack(TheEverbrightModModBlocks.JASPER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheEverbrightModModBlocks.JASPER.get().asItem());
				tabData.accept(TheEverbrightModModItems.EVERBRIGHT_DUST.get());
				tabData.accept(TheEverbrightModModItems.EVERBRIGHT_INGOT.get());
				tabData.accept(TheEverbrightModModItems.EVERBRIGHT_SWORD.get());
				tabData.accept(TheEverbrightModModItems.EVERBRIGHT_PICKAXE.get());
				tabData.accept(TheEverbrightModModItems.EVERBRIGHT_AXE.get());
				tabData.accept(TheEverbrightModModItems.EVERBRIGHT_SHOVEL.get());
				tabData.accept(TheEverbrightModModItems.EVERBRIGHT_HELMET_HELMET.get());
				tabData.accept(TheEverbrightModModItems.EVERBRIGHT_HELMET_CHESTPLATE.get());
				tabData.accept(TheEverbrightModModItems.EVERBRIGHT_HELMET_LEGGINGS.get());
				tabData.accept(TheEverbrightModModItems.EVERBRIGHT_HELMET_BOOTS.get());
				tabData.accept(TheEverbrightModModItems.EVERBRIGHT_HOE.get());
				tabData.accept(TheEverbrightModModItems.EVERBRIGHT_SHEET.get());
				tabData.accept(TheEverbrightModModBlocks.TWILIGHT_LOG.get().asItem());
				tabData.accept(TheEverbrightModModBlocks.EVERBRIGHT_ORE.get().asItem());
				tabData.accept(TheEverbrightModModItems.TEMPLEFROG.get());
				tabData.accept(TheEverbrightModModItems.EVERBRIGHT_DIMENSION.get());
			}).withSearchBar().build());
}
