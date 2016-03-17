package ech042.mods.containersandrails.client;

import ech042.mods.containersandrails.CommonProxy;
import ech042.mods.containersandrails.init.CRBlocks;
import ech042.mods.containersandrails.init.CRItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;

public class ClientProxy extends CommonProxy
{
   @Override
   public void registerRenderInformation()
   {
      // do some stuff here
      CRItems.registerRenders();
      CRBlocks.registerRenders();
   }

   @Override
   public World getClientWorld() { return FMLClientHandler.instance().getClient().theWorld; }

   @Override
   public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
   {
      TileEntity te = world.getTileEntity(new BlockPos(x, y, z));

      if (te != null)
      {
         return te;
      }

      return null;
   }
}
