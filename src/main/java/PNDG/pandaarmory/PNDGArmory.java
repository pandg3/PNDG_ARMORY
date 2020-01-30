package PNDG.pandaarmory;

import PNDG.pandaarmory.client.ArmoryTab;
import PNDG.pandaarmory.item.ModItems;
import PNDG.pandaarmory.proxy.CommonProxy;
import PNDG.pandaarmory.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid=PNDGArmory.modID, name = PNDGArmory.name, version = PNDGArmory.version)
public class PNDGArmory {

    public static final String modID = "pandaarmory";
    public static final String name = "PNDA Armory";
    public static final String version = "0.0.1";
    public static final ArmoryTab creativeTab = new ArmoryTab();

    @SidedProxy(clientSide =  "PNDG.pandaarmory.proxy.ClientProxy", serverSide = "PNDG.pandaarmory.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modID)
    public static PNDGArmory instance;

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event){
        System.out.println(name + " is loading! ver: " + version);
    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event){

    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event){
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }
        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event){
            ModItems.registerModels();
            ModBlocks.registerModels();
        }
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }
    }
}
