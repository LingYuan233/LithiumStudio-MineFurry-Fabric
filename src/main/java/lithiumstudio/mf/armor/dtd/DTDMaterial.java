package lithiumstudio.mf.armor.dtd;

import lithiumstudio.mf.MineFurry;
import net.minecraft.client.sound.Sound;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class DTDMaterial implements ArmorMaterial {

    private static final int[] PROTECTION = {2, 5, 6, 2};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return 10000;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(MineFurry.ITEM_GLUE);
    }

    @Override
    public String getName() {
        return "dtd";
    }

    @Override
    public float getToughness() {
        return 1f;
    }

    @Override
    public float getKnockbackResistance() {
        return 1f;
    }
}
