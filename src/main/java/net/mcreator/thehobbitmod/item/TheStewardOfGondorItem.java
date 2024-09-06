
package net.mcreator.thehobbitmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class TheStewardOfGondorItem extends RecordItem {
	public TheStewardOfGondorItem() {
		super(2, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_hobbit_mod:steward_of_gondor")), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 1880);
	}
}
