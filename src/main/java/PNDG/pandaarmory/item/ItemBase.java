package PNDG.pandaarmory.item;

import PNDG.pandaarmory.PNDGArmory;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    protected String name;





    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(PNDGArmory.creativeTab);
    }
    public void registerItemModel() {
        PNDGArmory.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab (CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
