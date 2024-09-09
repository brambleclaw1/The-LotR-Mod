
package net.mcreator.thehobbitmod.client.renderer;

public class NazgulRenderer extends HumanoidMobRenderer<NazgulEntity, HumanoidModel<NazgulEntity>> {

	public NazgulRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(NazgulEntity entity) {
		return new ResourceLocation("the_hobbit_mod:textures/entities/2022_04_26_nazgul-20242702.png");
	}

}
