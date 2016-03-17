package ech042.mods.containersandrails;

import ech042.mods.containersandrails.init.CRBlocks;
import ech042.mods.containersandrails.init.CRItems;
import ech042.mods.containersandrails.utility.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = ContainersAndRails.MODID, version = ContainersAndRails.VERSIONFINAL)
public class ContainersAndRails
{
   // Static variables relating for the mod
   public static final String MODID = "containersandrails";
   public static final String MODNAME = "Containers and Rails";
   public static final String VERSIONMAJOR = "0";
   public static final String VERSIONMINOR = "1";
   public static final String VERSIONBUILD = "a";
   public static final String VERSIONFINAL = VERSIONMAJOR + "." + VERSIONMINOR + VERSIONBUILD;

   public static final String COMMON_PROXY = "ech042.mods.containersandrails.CommonProxy";
   public static final String CLIENT_PROXY = "ech042.mods.containersandrails.client.ClientProxy";

   @SidedProxy(clientSide = ContainersAndRails.CLIENT_PROXY, serverSide = ContainersAndRails.COMMON_PROXY)
   public static CommonProxy proxy;

   @Instance(ContainersAndRails.MODID)
   public static ContainersAndRails instance;

   public ContainersAndRailsTab creativeTab;

   @EventHandler
   public void preInit(FMLPreInitializationEvent event)
   {
      LogHelper.info("PreInitialization...");

      this.creativeTab = new ContainersAndRailsTab();

      // Initialise and register items
      CRItems.init();
      CRItems.register();
      CRItems.registerRecipes();

      // Initialise and register blocks
      CRBlocks.init();
      CRBlocks.register();
      CRBlocks.registerRecipes();
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