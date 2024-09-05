
package net.mcreator.thehobbitmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class GlamdringItem extends SwordItem {
	public GlamdringItem() {
		super(new Tier() {
			public int getUses() {
				return 5067;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 26f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, 0f, new Item.Properties());
	}
}
