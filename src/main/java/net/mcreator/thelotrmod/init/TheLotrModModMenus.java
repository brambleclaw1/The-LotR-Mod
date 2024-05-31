
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thelotrmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.thelotrmod.world.inventory.ForgerGuiMenu;
import net.mcreator.thelotrmod.TheLotrModMod;

public class TheLotrModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TheLotrModMod.MODID);
	public static final RegistryObject<MenuType<ForgerGuiMenu>> FORGER_GUI = REGISTRY.register("forger_gui", () -> IForgeMenuType.create(ForgerGuiMenu::new));
}
