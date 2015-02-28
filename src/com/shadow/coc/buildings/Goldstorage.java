package com.shadow.coc.buildings;

import org.bukkit.Location;
import org.bukkit.Material;

public class Goldstorage extends Structure{
	
		 @SuppressWarnings("deprecation")
		 @Override
		 public void Build(Location center, int level) {
		  switch(level)
		  {
		  case 1:
			  center.add(0, 0, 0).getBlock().setType(Material.GOLD_BLOCK);
			  center.add(1, 0, 1).getBlock().setType(Material.STEP);
			  center.add(0, 0, 1).getBlock().setType(Material.STEP);
			  center.add(-1, 0, 1).getBlock().setType(Material.STEP);
			  center.add(-1, 0, 0).getBlock().setType(Material.STEP);
			  center.add(-1, 0, -1).getBlock().setType(Material.STEP);
			  center.add(0, 0, -1).getBlock().setType(Material.STEP);
			  center.add(1, 0, -1).getBlock().setType(Material.STEP);
			  center.add(1, 0, 0).getBlock().setType(Material.STEP);
			  break;
		  case 2:
			  center.add(0, 0, 0).getBlock().setType(Material.GOLD_BLOCK);
			  center.add(1, 0, 1).getBlock().setType(Material.WOOD_STAIRS);
			  center.add(0, 0, 1).getBlock().setType(Material.WOOD_STAIRS);
			  center.add(-1, 0, 1).getBlock().setType(Material.WOOD_STAIRS);
			  center.add(1, 0, 0).getBlock().setType(Material.WOOD_STAIRS);
			  center.getBlock().setData((byte)2);
			  center.add(-1, 0, 0).getBlock().setType(Material.WOOD_STAIRS);
			  center.getBlock().setData((byte)3)
			  
		  }
		 }
}
