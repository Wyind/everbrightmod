
package net.mcreator.theeverbrightmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.theeverbrightmod.init.TheEverbrightModModItems;

public abstract class EverbrightHelmetItem extends ArmorItem {
	public EverbrightHelmetItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 45;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{5, 5, 5, 5}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.metal.hit"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheEverbrightModModItems.EVERBRIGHT_INGOT.get()));
			}

			@Override
			public String getName() {
				return "everbright_helmet";
			}

			@Override
			public float getToughness() {
				return 5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.5f;
			}
		}, type, properties);
	}

	public static class Helmet extends EverbrightHelmetItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "the_everbright_mod:textures/models/armor/diamond__layer_1.png";
		}
	}

	public static class Chestplate extends EverbrightHelmetItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "the_everbright_mod:textures/models/armor/diamond__layer_1.png";
		}
	}

	public static class Leggings extends EverbrightHelmetItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "the_everbright_mod:textures/models/armor/diamond__layer_2.png";
		}
	}

	public static class Boots extends EverbrightHelmetItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "the_everbright_mod:textures/models/armor/diamond__layer_1.png";
		}
	}
}
