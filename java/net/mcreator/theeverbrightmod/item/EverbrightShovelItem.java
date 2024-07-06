
package net.mcreator.theeverbrightmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.theeverbrightmod.init.TheEverbrightModModItems;

public class EverbrightShovelItem extends ShovelItem {
	public EverbrightShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 8f;
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
		}, 1, -3f, new Item.Properties().fireResistant());
	}
}
