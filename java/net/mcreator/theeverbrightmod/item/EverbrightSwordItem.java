
package net.mcreator.theeverbrightmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.theeverbrightmod.init.TheEverbrightModModItems;

public class EverbrightSwordItem extends SwordItem {
	public EverbrightSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheEverbrightModModItems.EVERBRIGHT_INGOT.get()));
			}
		}, 3, -2f, new Item.Properties().fireResistant());
	}
}
