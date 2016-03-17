package ech042.mods.containersandrails;

import ech042.mods.containersandrails.init.CRBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainersAndRailsTab extends CreativeTabs
{
   public ContainersAndRailsTab()
   {
      super("CandR");
   }

   @Override
   @SideOnly(Side.CLIENT)
   public Item getTabIconItem()
   {
      return Item.getItemFromBlock(CRBlocks.wood_container_frame);
   }
}
