
package net.mcreator.theeverbrightmod.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class TemplefrogItem extends RecordItem {
	public TemplefrogItem() {
		super(0, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("the_everbright_mod:templefrog")), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 6320);
	}
}
