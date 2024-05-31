
package net.mcreator.thelotrmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.thelotrmod.init.TheLotrModModItems;

public class Mithril_ToolsSwordItem extends SwordItem {
	public Mithril_ToolsSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 5419;
			}

			public float getSpeed() {
				return 22f;
			}

			public float getAttackDamageBonus() {
				return 50f;
			}

			public int getLevel() {
				return 18;
			}

			public int getEnchantmentValue() {
				return 126;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheLotrModModItems.MITHRIL_INGOT.get()));
			}
		}, 3, -3f, new Item.Properties());
	}
}
