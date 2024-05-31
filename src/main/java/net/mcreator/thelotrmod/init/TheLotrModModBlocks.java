
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thelotrmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thelotrmod.block.MithrilOreBlock;
import net.mcreator.thelotrmod.block.MallornWoodBlock;
import net.mcreator.thelotrmod.block.MallornStairsBlock;
import net.mcreator.thelotrmod.block.MallornSlabBlock;
import net.mcreator.thelotrmod.block.MallornPressurePlateBlock;
import net.mcreator.thelotrmod.block.MallornPlanksBlock;
import net.mcreator.thelotrmod.block.MallornLogBlock;
import net.mcreator.thelotrmod.block.MallornLeavesBlock;
import net.mcreator.thelotrmod.block.MallornFenceGateBlock;
import net.mcreator.thelotrmod.block.MallornFenceBlock;
import net.mcreator.thelotrmod.block.MallornButtonBlock;
import net.mcreator.thelotrmod.block.ForgerBlock;
import net.mcreator.thelotrmod.block.DeepslateMithrilOreBlock;
import net.mcreator.thelotrmod.block.BurningMagmaBlock;
import net.mcreator.thelotrmod.block.ArchaicGoldBlock;
import net.mcreator.thelotrmod.TheLotrModMod;

public class TheLotrModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheLotrModMod.MODID);
	public static final RegistryObject<Block> BURNING_MAGMA = REGISTRY.register("burning_magma", () -> new BurningMagmaBlock());
	public static final RegistryObject<Block> MITHRIL_ORE = REGISTRY.register("mithril_ore", () -> new MithrilOreBlock());
	public static final RegistryObject<Block> MALLORN_WOOD = REGISTRY.register("mallorn_wood", () -> new MallornWoodBlock());
	public static final RegistryObject<Block> MALLORN_LOG = REGISTRY.register("mallorn_log", () -> new MallornLogBlock());
	public static final RegistryObject<Block> MALLORN_PLANKS = REGISTRY.register("mallorn_planks", () -> new MallornPlanksBlock());
	public static final RegistryObject<Block> MALLORN_LEAVES = REGISTRY.register("mallorn_leaves", () -> new MallornLeavesBlock());
	public static final RegistryObject<Block> MALLORN_STAIRS = REGISTRY.register("mallorn_stairs", () -> new MallornStairsBlock());
	public static final RegistryObject<Block> MALLORN_SLAB = REGISTRY.register("mallorn_slab", () -> new MallornSlabBlock());
	public static final RegistryObject<Block> MALLORN_FENCE = REGISTRY.register("mallorn_fence", () -> new MallornFenceBlock());
	public static final RegistryObject<Block> MALLORN_FENCE_GATE = REGISTRY.register("mallorn_fence_gate", () -> new MallornFenceGateBlock());
	public static final RegistryObject<Block> MALLORN_PRESSURE_PLATE = REGISTRY.register("mallorn_pressure_plate", () -> new MallornPressurePlateBlock());
	public static final RegistryObject<Block> MALLORN_BUTTON = REGISTRY.register("mallorn_button", () -> new MallornButtonBlock());
	public static final RegistryObject<Block> FORGER = REGISTRY.register("forger", () -> new ForgerBlock());
	public static final RegistryObject<Block> DEEPSLATE_MITHRIL_ORE = REGISTRY.register("deepslate_mithril_ore", () -> new DeepslateMithrilOreBlock());
	public static final RegistryObject<Block> ARCHAIC_GOLD = REGISTRY.register("archaic_gold", () -> new ArchaicGoldBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
