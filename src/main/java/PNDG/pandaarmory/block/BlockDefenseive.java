package PNDG.pandaarmory.block;



import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDefenseive extends BlockBase {
    public BlockDefenseive(String name, float hardness, float resistance){
        super(Material.ROCK, name);

        setHardness(hardness);
        setResistance(resistance);
    }

    @Override
    public BlockDefenseive setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
