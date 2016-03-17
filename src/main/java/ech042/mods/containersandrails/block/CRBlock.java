package ech042.mods.containersandrails.block;

import ech042.mods.containersandrails.ContainersAndRails;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CRBlock extends Block
{
   public CRBlock(String name, Material materialIn)
   {
      super(materialIn);

      this.setUnlocalizedName(name);
      this.setCreativeTab(ContainersAndRails.instance.creativeTab);
      this.setHardness(2.f);
   }
}
