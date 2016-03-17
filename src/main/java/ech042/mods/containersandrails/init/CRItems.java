package ech042.mods.containersandrails.init;

import ech042.mods.containersandrails.ContainersAndRails;
import ech042.mods.containersandrails.item.CRItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by Robert on 2016/03/17.
 */
public class CRItems
{
   public static CRItem clipboard;

   public static void init()
   {
      clipboard = new CRItem("clipboard");
   }

   public static void register()
   {
      GameRegistry.registerItem(clipboard, clipboard.getUnlocalizedName().substring(5));
   }

   public static void registerRenders()
   {
      registerRender(clipboard);
   }

   public static void registerRender(Item item)
   {
      Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ContainersAndRails.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
   }

   public static void registerRecipes()
   {
      GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(clipboard),
                                                 "  A",
                                                 " B ",
                                                 "C  ",
                                                 'A', Items.iron_ingot,
                                                 'B', Items.paper,
                                                 'C', "woodPlank"));
   }
}
