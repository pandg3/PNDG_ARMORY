package PNDG.pandaarmory.block;



import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDefenseive extends BlockBase {
    public BlockDefenseive(String name){
        super(Material.ROCK, name);

        setHardness(3f);
        setResistance(5f);
    }

    @Override
    public BlockDefenseive setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
