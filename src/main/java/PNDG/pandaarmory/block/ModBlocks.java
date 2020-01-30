package PNDG.pandaarmory.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
    public static BlockDefenseive defenseiveConcrete = new BlockDefenseive("defensive_Concrete");
    public static void register(IForgeRegistry<Block> registry){
        registry.registerAll(
                defenseiveConcrete

        );


    }
    public static void registerItemBlocks(IForgeRegistry<Item> registry){
        registry.registerAll(
                defenseiveConcrete.createItemBlock()

        );
    }
    public static void registerModels() {
        defenseiveConcrete.registerItemModel(Item.getItemFromBlock(defenseiveConcrete));
    }
}
