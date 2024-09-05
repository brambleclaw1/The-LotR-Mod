
package net.mcreator.thehobbitmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class Mithril_ToolsHoeItem extends HoeItem {
	public Mithril_ToolsHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 5419;
			}

			public float getSpeed() {
				return 22f;
			}

			public float getAttackDamageBonus() {
				return 17f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 126;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheHobbitModModItems.MITHRIL_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
