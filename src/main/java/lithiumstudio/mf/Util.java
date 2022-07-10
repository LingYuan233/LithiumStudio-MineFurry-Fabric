package lithiumstudio.mf;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class Util {
    public static Item.Settings setItemSetting(){
        return new Item.Settings().group(MineFurry.MF_GROUP);
    }
    public static Item.Settings setRecordItemSetting(){
        return new Item.Settings().group(MineFurry.MF_RECORD_GROUP);
    }

    public static Block.Settings setBlockSetting(Material material){
        return Block.Settings.of(material);
    }

    public static BlockItem setBlockItem(Block block){
        return new BlockItem(block, new Item.Settings().group((MineFurry.MF_GROUP)));
    }

    public static Identifier setIdentifier(String name){
        return new Identifier("tarp_craft",name);
    }

    public static Item setItem(){
        return new Item(new FabricItemSettings().group((MineFurry.MF_GROUP)));
    }
}
