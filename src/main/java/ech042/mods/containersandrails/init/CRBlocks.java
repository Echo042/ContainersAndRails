package ech042.mods.containersandrails.init;

import ech042.mods.containersandrails.ContainersAndRails;
import ech042.mods.containersandrails.block.CRBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class CRBlocks
{
   public static Block wood_container_frame;
   public static Block iron_container_frame;
   public static Block obsidian_container_frame;
   public static Block ender_container_frame;

   public static void init()
   {
      wood_container_frame = new CRBlock("wood_container_frame", Material.wood);
      iron_container_frame = new CRBlock("iron_container_frame", Material.iron);
      obsidian_container_frame = new CRBlock("obsidian_container_frame", Material.iron);
      ender_container_frame = new CRBlock("ender_container_frame", Material.iron);
   }

   public static void register()
   {
      GameRegistry.registerBlock(wood_container_frame, wood_container_frame.getUnlocalizedName().substring(5));
      GameRegistry.registerBlock(iron_container_frame, iron_container_frame.getUnlocalizedName().substring(5));
      GameRegistry.registerBlock(obsidian_container_frame, obsidian_container_frame.getUnlocalizedName().substring(5));
      GameRegistry.registerBlock(ender_container_frame, ender_container_frame.getUnlocalizedName().substring(5));
   }

   public static void registerRenders()
   {
      registerRender(wood_container_frame);
      registerRender(iron_container_frame);
      registerRender(obsidian_container_frame);
      registerRender(ender_container_frame);
   }

   public static void registerRender(Block block)
   {
      Item item = Item.getItemFromBlock(block);
      Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ContainersAndRails.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
   }

   public static void registerRecipes()
   {
      GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(wood_container_frame),
                                                 " A ",
                                                 "ABA",
                                                 " A ",
                                                 'A', "logWood",
                                                 'B',  Blocks.chest));

      GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(iron_container_frame),
                                                 " A ",
                                                 "ABA",
                                                 " A ",
                                                 'A', Items.iron_ingot,
                                                 'B', wood_container_frame));

      GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(obsidian_container_frame),
                                                 " A ",
                                                 "ABA",
                                                 " A ",
                                                 'A', Blocks.obsidian,
                                                 'B', iron_container_frame));

      GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ender_container_frame),
                                                 " A ",
                                                 "ABA",
                                                 " A ",
                                                 'A', Blocks.end_stone,
                                                 'B', obsidian_container_frame));
   }
}
