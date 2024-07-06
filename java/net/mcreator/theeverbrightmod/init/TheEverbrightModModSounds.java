
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theeverbrightmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.theeverbrightmod.TheEverbrightModMod;

public class TheEverbrightModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, TheEverbrightModMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> TEMPLEFROG = REGISTRY.register("templefrog", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_everbright_mod", "templefrog")));
}
