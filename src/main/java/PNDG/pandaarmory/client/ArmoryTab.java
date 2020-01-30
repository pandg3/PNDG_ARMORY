package PNDG.pandaarmory.client;

import PNDG.pandaarmory.PNDGArmory;
import PNDG.pandaarmory.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ArmoryTab extends CreativeTabs {
    public ArmoryTab(){
        super(PNDGArmory.modID);
    }

    @Override
    public ItemStack getTabIconItem(){
        return new ItemStack(ModItems.componentCircuit);
    }
}
