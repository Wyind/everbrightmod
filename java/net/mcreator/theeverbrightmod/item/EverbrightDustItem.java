
package net.mcreator.theeverbrightmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EverbrightDustItem extends Item {
	public EverbrightDustItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
