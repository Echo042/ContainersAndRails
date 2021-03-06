package ech042.mods.containersandrails;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler
{
   public void registerRenderInformation()
   {

   }

   @Override
   public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { return null; }

   @Override
   public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
   {
      TileEntity te = world.getTileEntity(new BlockPos(x, y, z));
      if (te != null)
      {
         return null; // Actually return the tile entity?
      }
      else
      {
         return null;
      }
   }

   public World getClientWorld()
   {
      return null;
   }
}
