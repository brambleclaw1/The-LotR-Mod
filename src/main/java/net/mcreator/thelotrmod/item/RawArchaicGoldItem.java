
package net.mcreator.thelotrmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawArchaicGoldItem extends Item {
	public RawArchaicGoldItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
