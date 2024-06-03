
package net.mcreator.thehobbitmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ArchaicGoldIngotItem extends Item {
	public ArchaicGoldIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
