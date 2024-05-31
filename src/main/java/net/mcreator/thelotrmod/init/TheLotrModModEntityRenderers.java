
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thelotrmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.thelotrmod.client.renderer.OrcRenderer;
import net.mcreator.thelotrmod.client.renderer.NazgulRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheLotrModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheLotrModModEntities.ORC.get(), OrcRenderer::new);
		event.registerEntityRenderer(TheLotrModModEntities.NAZGUL.get(), NazgulRenderer::new);
	}
}
