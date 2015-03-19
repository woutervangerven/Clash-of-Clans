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
			  //South
			  center.add(1,0,1).getBlock().setType(Material.STEP); //Left-up
			  center.add(-1,0,0).getBlock().setType(Material.STEP); //Mid-up
			  center.add(-1,0,0).getBlock().setType(Material.STEP); //Right-up
			  center.add(0,0,-1).getBlock().setType(Material.STEP); //Right-Mid
			  center.add(1,0,0).getBlock().setType(Material.STEP); //Mid-Mid
			  center.add(1,0,0).getBlock().setType(Material.STEP); //Left-Mid
			  center.add(0,0,-1).getBlock().setType(Material.STEP); //Left-Down
			  center.add(-1,0,0).getBlock().setType(Material.STEP); //Mid-Down
			  center.add(-1,0,0).getBlock().setType(Material.STEP); //Right-Down
			  break;
		  case 2:
			  center.add(1,0,1).getBlock().setType(Material.WOOD_STAIRS); //Left-up
			  center.getBlock().setData((byte)8);
			  center.add(-1,0,0).getBlock().setType(Material.WOOD_STAIRS); //Mid-up
			  center.getBlock().setData((byte)8);
			  center.add(-1,0,0).getBlock().setType(Material.WOOD_STAIRS); //Right-up
			  center.getBlock().setData((byte)8);
			  center.add(0,0,-1).getBlock().setType(Material.WOOD_STAIRS); //Right-Mid
			  center.getBlock().setData((byte)2);
			  center.add(1,0,0).getBlock().setType(Material.GOLD_BLOCK); //Mid-Mid
			  center.add(1,0,0).getBlock().setType(Material.WOOD_STAIRS); //Left-Mid
			  center.getBlock().setData((byte)3);
			  center.add(0,0,-1).getBlock().setType(Material.WOOD_STAIRS); //Left-Down
			  center.getBlock().setData((byte)1);
			  center.add(-1,0,0).getBlock().setType(Material.WOOD_STAIRS); //Mid-Down
			  center.getBlock().setData((byte)1);
			  center.add(-1,0,0).getBlock().setType(Material.WOOD_STAIRS); //Right-Down
			  center.getBlock().setData((byte)1);
		  case 3:
			  center.add(1,0,1).getBlock().setType(Material.WOOD); //Left-up
			  center.add(-1,0,0).getBlock().setType(Material.WOOD); //Mid-up
			  center.add(-1,0,0).getBlock().setType(Material.WOOD); //Right-up
			  center.add(0,0,-1).getBlock().setType(Material.WOOD); //Right-Mid
			  center.add(1,0,0).getBlock().setType(Material.WOOD); //Mid-Mid
			  center.add(1,0,0).getBlock().setType(Material.WOOD); //Left-Mid
			  center.add(0,0,-1).getBlock().setType(Material.WOOD); //Left-Down
			  center.add(-1,0,0).getBlock().setType(Material.WOOD); //Mid-Down
			  center.add(-1,0,0).getBlock().setType(Material.WOOD); //Right-Down
			  center.add(2,1,2).getBlock().setType(Material.STEP); //Left-up
			  center.add(-1,0,0).getBlock().setType(Material.STEP); //Mid-up
			  center.add(-1,0,0).getBlock().setType(Material.STEP); //Right-up
			  center.add(0,0,-1).getBlock().setType(Material.STEP); //Right-Mid
			  center.add(1,0,0).getBlock().setType(Material.GOLD_BLOCK); //Mid-Mid
			  center.add(1,0,0).getBlock().setType(Material.STEP); //Left-Mid
			  center.add(0,0,-1).getBlock().setType(Material.STEP); //Left-Down
			  center.add(-1,0,0).getBlock().setType(Material.STEP); //Mid-Down
			  center.add(-1,0,0).getBlock().setType(Material.STEP); //Right-Down
			  break;
		  case 4:
			  center.add(1,0,1).getBlock().setType(Material.WOOD); //Left-up
			  center.add(-1,0,0).getBlock().setType(Material.WOOD); //Mid-up
			  center.add(-1,0,0).getBlock().setType(Material.WOOD); //Right-up
			  center.add(0,0,-1).getBlock().setType(Material.WOOD); //Right-Mid
			  center.add(1,0,0).getBlock().setType(Material.WOOD); //Mid-Mid
			  center.add(1,0,0).getBlock().setType(Material.WOOD); //Left-Mid
			  center.add(0,0,-1).getBlock().setType(Material.WOOD); //Left-Down
			  center.add(-1,0,0).getBlock().setType(Material.WOOD); //Mid-Down
			  center.add(-1,0,0).getBlock().setType(Material.WOOD); //Right-Down
			  center.add(2,1,2).getBlock().setType(Material.WOOD_STAIRS); //Left-up
			  center.getBlock().setData((byte)8);
			  center.add(-1,0,0).getBlock().setType(Material.WOOD_STAIRS); //Mid-up
			  center.getBlock().setData((byte)8);
			  center.add(-1,0,0).getBlock().setType(Material.WOOD_STAIRS); //Right-up
			  center.getBlock().setData((byte)8);
			  center.add(0,0,-1).getBlock().setType(Material.WOOD_STAIRS); //Right-Mid
			  center.getBlock().setData((byte)2);
			  center.add(1,0,0).getBlock().setType(Material.GOLD_BLOCK); //Mid-Mid
			  center.add(1,0,0).getBlock().setType(Material.WOOD_STAIRS); //Left-Mid
			  center.getBlock().setData((byte)3);
			  center.add(0,0,-1).getBlock().setType(Material.WOOD_STAIRS); //Left-Down
			  center.getBlock().setData((byte)1);
			  center.add(-1,0,0).getBlock().setType(Material.WOOD_STAIRS); //Mid-Down
			  center.getBlock().setData((byte)1);
			  center.add(-1,0,0).getBlock().setType(Material.WOOD_STAIRS); //Right-Down
			  center.getBlock().setData((byte)1);
		  }
		 }
}
