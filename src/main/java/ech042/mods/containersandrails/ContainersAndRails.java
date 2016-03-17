package ech042.mods.containersandrails;

import ech042.mods.containersandrails.init.ContainersBlocks;
import ech042.mods.containersandrails.utility.LogHelper;
import ech042.mods.containersandrails.utility.Reference;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID, version = Reference.VERSIONFINAL)
public class ContainersAndRails
{
   @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
   public static CommonProxy proxy;

   @Instance(Reference.MODID)
   public static ContainersAndRails instance;

   public ContainersAndRailsTab creativeTab;

   @EventHandler
   public void preInit(FMLPreInitializationEvent event)
   {
      LogHelper.info("PreInitialization...");

      this.creativeTab = new ContainersAndRailsTab();

      ContainersBlocks.init();
      ContainersBlocks.register();
      ContainersBlocks.registerRecipes();
   }

   @EventHandler
   public void init(FMLInitializationEvent event)
   {
      // some example code
      LogHelper.info("Initialization...");
      proxy.registerRenderInformation();
   }

   @EventHandler
   public void postInit(FMLPostInitializationEvent event)
   {
      System.out.println("Post-initialisation");
   }
}