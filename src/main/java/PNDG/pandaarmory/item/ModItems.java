package PNDG.pandaarmory.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemBase componentCircuit = new ItemBase("component_Circuit");



    public static void register (IForgeRegistry<Item> registry){
        registry.registerAll(
                componentCircuit

        );
    }
    public static void registerModels(){
        componentCircuit.registerItemModel();

    }
}
