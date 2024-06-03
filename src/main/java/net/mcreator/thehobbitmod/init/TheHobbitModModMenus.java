
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehobbitmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.thehobbitmod.world.inventory.ForgerGuiMenu;
import net.mcreator.thehobbitmod.TheHobbitModMod;

public class TheHobbitModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TheHobbitModMod.MODID);
	public static final RegistryObject<MenuType<ForgerGuiMenu>> FORGER_GUI = REGISTRY.register("forger_gui", () -> IForgeMenuType.create(ForgerGuiMenu::new));
}
