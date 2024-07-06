
package net.mcreator.theeverbrightmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.theeverbrightmod.init.TheEverbrightModModItems;

public class EverbrightPickaxeItem extends AxeItem {
	public EverbrightPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4536;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheEverbrightModModItems.EVERBRIGHT_INGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties().fireResistant());
	}
}
