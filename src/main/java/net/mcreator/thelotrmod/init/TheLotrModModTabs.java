
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thelotrmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.thelotrmod.TheLotrModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheLotrModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheLotrModMod.MODID);
	public static final RegistryObject<CreativeModeTab> THE_HOBBIT_MOD = REGISTRY.register("the_hobbit_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_lotr_mod.the_hobbit_mod")).icon(() -> new ItemStack(TheLotrModModItems.THE_ONE_RING.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheLotrModModItems.MITHRIL_INGOT.get());
				tabData.accept(TheLotrModModItems.THE_ONE_RING.get());
				tabData.accept(TheLotrModModItems.HEATED_MITHRIL.get());
				tabData.accept(TheLotrModModItems.RAW_MITHRIL.get());
				tabData.accept(TheLotrModModItems.BURNING_MAGMA_SHARD.get());
				tabData.accept(TheLotrModModBlocks.BURNING_MAGMA.get().asItem());
				tabData.accept(TheLotrModModItems.STING.get());
				tabData.accept(TheLotrModModItems.GLAMDRING.get());
				tabData.accept(TheLotrModModItems.ORCRIST.get());
				tabData.accept(TheLotrModModBlocks.MITHRIL_ORE.get().asItem());
				tabData.accept(TheLotrModModItems.PIPE.get());
				tabData.accept(TheLotrModModItems.MITHRIL_ARMOR_HELMET.get());
				tabData.accept(TheLotrModModItems.MITHRIL_ARMOR_CHESTPLATE.get());
				tabData.accept(TheLotrModModItems.MITHRIL_ARMOR_LEGGINGS.get());
				tabData.accept(TheLotrModModItems.MITHRIL_ARMOR_BOOTS.get());
				tabData.accept(TheLotrModModItems.ORC_SPAWN_EGG.get());
				tabData.accept(TheLotrModModItems.MISTY_MOUNTAINS.get());
				tabData.accept(TheLotrModModItems.NINE_RINGS.get());
				tabData.accept(TheLotrModModItems.NAZGUL_SPAWN_EGG.get());
				tabData.accept(TheLotrModModItems.SEVEN_RINGS.get());
				tabData.accept(TheLotrModModItems.THREE_RINGS.get());
				tabData.accept(TheLotrModModItems.TARNISHED_RING.get());
				tabData.accept(TheLotrModModBlocks.MALLORN_WOOD.get().asItem());
				tabData.accept(TheLotrModModBlocks.MALLORN_LOG.get().asItem());
				tabData.accept(TheLotrModModBlocks.MALLORN_PLANKS.get().asItem());
				tabData.accept(TheLotrModModBlocks.MALLORN_STAIRS.get().asItem());
				tabData.accept(TheLotrModModBlocks.MALLORN_SLAB.get().asItem());
				tabData.accept(TheLotrModModBlocks.MALLORN_FENCE.get().asItem());
				tabData.accept(TheLotrModModBlocks.MALLORN_FENCE_GATE.get().asItem());
				tabData.accept(TheLotrModModBlocks.MALLORN_BUTTON.get().asItem());
				tabData.accept(TheLotrModModBlocks.FORGER.get().asItem());
				tabData.accept(TheLotrModModBlocks.DEEPSLATE_MITHRIL_ORE.get().asItem());
				tabData.accept(TheLotrModModItems.ARCHAIC_GOLD_INGOT.get());
				tabData.accept(TheLotrModModItems.RAW_ARCHAIC_GOLD.get());
				tabData.accept(TheLotrModModBlocks.ARCHAIC_GOLD.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(TheLotrModModBlocks.MALLORN_PRESSURE_PLATE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TheLotrModModItems.MITHRIL_TOOLS_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(TheLotrModModBlocks.MALLORN_LEAVES.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TheLotrModModItems.MITHRIL_TOOLS_PICKAXE.get());
			tabData.accept(TheLotrModModItems.MITHRIL_TOOLS_AXE.get());
			tabData.accept(TheLotrModModItems.MITHRIL_TOOLS_SHOVEL.get());
			tabData.accept(TheLotrModModItems.MITHRIL_TOOLS_HOE.get());
		}
	}
}
