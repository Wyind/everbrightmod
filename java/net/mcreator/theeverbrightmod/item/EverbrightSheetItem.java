
package net.mcreator.theeverbrightmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EverbrightSheetItem extends Item {
	public EverbrightSheetItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
