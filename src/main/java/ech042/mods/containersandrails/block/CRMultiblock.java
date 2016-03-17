package ech042.mods.containersandrails.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

// Borrowing heavily from EZStorage: https://github.com/zerofall/EZStorage

public class CRMultiblock extends CRBlock
{
   public CRMultiblock(String name, Material materialIn)
   {
      super(name, materialIn);
   }

   @Override
   public void onBlockDestroyedByPlayer(World worldIn, BlockPos position, IBlockState state)
   {
      super.onBlockDestroyedByPlayer(worldIn, position, state);

   }

   public void createMultiblock(World world, BlockPos position)
   {
      if (!world.isRemote)
      {
      }
   }
}
