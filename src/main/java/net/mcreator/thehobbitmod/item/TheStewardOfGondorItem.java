
package net.mcreator.thehobbitmod.item;

import net.minecraft.network.chat.Component;

public class TheStewardOfGondorItem extends RecordItem {

	public TheStewardOfGondorItem() {
		super(2, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_hobbit_mod:steward_of_gondor")), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 1880);
	}

}
