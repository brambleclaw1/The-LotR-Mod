package net.mcreator.thelotrmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.thelotrmod.world.inventory.ForgerGuiMenu;
import net.mcreator.thelotrmod.network.ForgerGuiButtonMessage;
import net.mcreator.thelotrmod.TheLotrModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ForgerGuiScreen extends AbstractContainerScreen<ForgerGuiMenu> {
	private final static HashMap<String, Object> guistate = ForgerGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_melt;

	public ForgerGuiScreen(ForgerGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("the_lotr_mod:textures/screens/forger_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("the_lotr_mod:textures/screens/arrow.png"), this.leftPos + 115, this.topPos + 36, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.the_lotr_mod.forger_gui.label_forger"), 73, 14, -13421773, false);
	}

	@Override
	public void init() {
		super.init();
		button_melt = Button.builder(Component.translatable("gui.the_lotr_mod.forger_gui.button_melt"), e -> {
			if (true) {
				TheLotrModMod.PACKET_HANDLER.sendToServer(new ForgerGuiButtonMessage(0, x, y, z));
				ForgerGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 65, this.topPos + 58, 46, 20).build();
		guistate.put("button:button_melt", button_melt);
		this.addRenderableWidget(button_melt);
	}
}
