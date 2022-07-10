package lithiumstudio.mf;

import lithiumstudio.mf.armor.dtd.DTDArmor;
import lithiumstudio.mf.armor.dtd.DTDMaterial;
import lithiumstudio.mf.items.ItemCloth;
import lithiumstudio.mf.items.ItemFur;
import lithiumstudio.mf.items.ItemGlue;
import lithiumstudio.mf.items.RecordBase;
import lithiumstudio.mf.painting.Paintings;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static lithiumstudio.mf.Util.*;

public class MineFurry implements ModInitializer {
	public static final ItemGroup MF_GROUP = FabricItemGroupBuilder.build(new Identifier("mf", "mf_group"), () -> new ItemStack(MineFurry.ITEM_FUR));
	public static final ItemGroup MF_RECORD_GROUP = FabricItemGroupBuilder.build(new Identifier("mf", "mf_record_group"), () -> new ItemStack(MineFurry.RECORD_BE_AWARE_OF_FURRIES));



	public static final Identifier RECORD_BE_AWARE_OF_FURRIES_ID = new Identifier("mf", "be_aware_of_furries");
	public static SoundEvent RECORD_BE_AWARE_OF_FURRIES_EVENT = new SoundEvent(RECORD_BE_AWARE_OF_FURRIES_ID);

	private static final Item ITEM_FUR = new ItemFur(setItemSetting());
	private static final Item DUCT_TAPE = new Item(setItemSetting());
	public  static final Item ITEM_GLUE = new ItemGlue(setItemSetting());
	private static final Item ITEM_CLOTH = new ItemCloth(setItemSetting());
	private static final Item FUR_FABRIC = setItem();
	private static final Item RECORD_BE_AWARE_OF_FURRIES = new RecordBase(10, RECORD_BE_AWARE_OF_FURRIES_EVENT, setRecordItemSetting(), "record_be_aware_of_furries");

	public static final ArmorMaterial DTD_MATERIAL = new DTDMaterial();
	public static final DTDArmor DTD_ARMOR_CHEST = new DTDArmor(DTD_MATERIAL, EquipmentSlot.CHEST, setItemSetting());
	public static final DTDArmor DTD_ARMOR_LEGS = new DTDArmor(DTD_MATERIAL, EquipmentSlot.LEGS, setItemSetting());
	//public static final DTDArmor DTD_ARMOR_HEAD = new DTDArmor(DTD_MATERIAL, EquipmentSlot.HEAD, setItemSetting());
	//public static final DTDArmor DTD_ARMOR_BOOTS = new DTDArmor(DTD_MATERIAL, EquipmentSlot.FEET, setItemSetting());

	@Override
	public void onInitialize() {
		Registry.register(Registry.SOUND_EVENT, RECORD_BE_AWARE_OF_FURRIES_ID, RECORD_BE_AWARE_OF_FURRIES_EVENT);

		Registry.register(Registry.ITEM, new Identifier("mf","item_fur"), ITEM_FUR);
		Registry.register(Registry.ITEM, new Identifier("mf","item_glue"), ITEM_GLUE);
		Registry.register(Registry.ITEM, new Identifier("mf","item_cloth"), ITEM_CLOTH);
		Registry.register(Registry.ITEM, new Identifier("mf","item_fabric"), FUR_FABRIC);
		Registry.register(Registry.ITEM, new Identifier("mf","dtd_body"), DTD_ARMOR_CHEST);
		Registry.register(Registry.ITEM, new Identifier("mf","dtd_legs"), DTD_ARMOR_LEGS);
		Registry.register(Registry.ITEM, new Identifier("mf","duct_tape"), DUCT_TAPE);

		Paintings.register();
//		Registry.register(Registry.ITEM, new Identifier("mf","dtd_head"), DTD_ARMOR_HEAD);
//		Registry.register(Registry.ITEM, new Identifier("mf","dtd_boots"), DTD_ARMOR_BOOTS);
		Registry.register(Registry.ITEM, new Identifier("mf","record_be_aware_of_furries"), RECORD_BE_AWARE_OF_FURRIES);
	}
}
