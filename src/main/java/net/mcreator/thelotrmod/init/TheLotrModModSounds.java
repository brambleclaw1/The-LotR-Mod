
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thelotrmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.thelotrmod.TheLotrModMod;

public class TheLotrModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TheLotrModMod.MODID);
	public static final RegistryObject<SoundEvent> FEAST_OF_STARLIGHT = REGISTRY.register("feast_of_starlight", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_lotr_mod", "feast_of_starlight")));
	public static final RegistryObject<SoundEvent> SMAUG = REGISTRY.register("smaug", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_lotr_mod", "smaug")));
	public static final RegistryObject<SoundEvent> MISTY_MOUNTAINS = REGISTRY.register("misty_mountains", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_lotr_mod", "misty_mountains")));
	public static final RegistryObject<SoundEvent> NAZGUL = REGISTRY.register("nazgul", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_lotr_mod", "nazgul")));
	public static final RegistryObject<SoundEvent> NAZGUL_DEAD = REGISTRY.register("nazgul_dead", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_lotr_mod", "nazgul_dead")));
	public static final RegistryObject<SoundEvent> GOLLUM = REGISTRY.register("gollum", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_lotr_mod", "gollum")));
	public static final RegistryObject<SoundEvent> RING = REGISTRY.register("ring", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_lotr_mod", "ring")));
}
