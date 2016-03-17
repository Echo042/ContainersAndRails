package ech042.mods.containersandrails.item;

import ech042.mods.containersandrails.ContainersAndRails;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CRItem extends Item
{
   public CRItem(String name)
   {
      this.setCreativeTab(ContainersAndRails.instance.creativeTab);
      this.setUnlocalizedName(name);
   }
}
