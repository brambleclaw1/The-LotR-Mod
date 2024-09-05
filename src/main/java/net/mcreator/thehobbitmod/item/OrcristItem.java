
package net.mcreator.thehobbitmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class OrcristItem extends SwordItem {
	public OrcristItem() {
		super(new Tier() {
			public int getUses() {
				return 9076;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 69f;
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
		}, 3, -2.6f, new Item.Properties());
	}
}
