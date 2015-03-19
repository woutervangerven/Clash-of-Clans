package com.shadow.coc.buildings;

import org.bukkit.Location;
import org.bukkit.Material;

public class Elixerpomp extends Structure {
 @SuppressWarnings("deprecation")
 @Override
 public void Build(Location center, int level) {
  switch(level)
  {
  case 1:
	  center.add(1,0,1).getBlock().setType(Material.AIR); //Left-up
	  center.add(-1,0,0).getBlock().setType(Material.WOOD); //Mid-up
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-up
	  center.add(0,0,-1).getBlock().setType(Material.WOOD); //Right-Mid
	  center.add(1,0,0).getBlock().setType(Material.WOOD); //Mid-Mid
	  center.add(1,0,0).getBlock().setType(Material.WOOD); //Left-Mid
	  center.add(0,0,-1).getBlock().setType(Material.COBBLE_WALL); //Left-Down
	  center.add(-1,0,0).getBlock().setType(Material.WOOD); //Mid-Down
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-Down
	  center.add(2,1,2).getBlock().setType(Material.AIR); //Left-up
	  center.add(-1,0,0).getBlock().setType(Material.STAINED_GLASS); //Mid-up
	  center.getBlock().setData((byte)2);
	  center.add(-1,0,0).getBlock().setType(Material.air); //Right-up
	  center.add(0,0,-1).getBlock().setType(Material.STAINED_GLASS); //Right-Mid
	  center.getBlock().setData((byte)2);
	  center.add(1,0,0).getBlock().setType(Material.WOOL); //Mid-Mid
	  center.getBlock().setData((byte)2);
	  center.add(1,0,0).getBlock().setType(Material.STAINED_GLASS); //Left-Mid
	  center.getBlock().setData((byte)2);
	  center.add(0,0,-1).getBlock().setType(Material.COBBLE_WALL); //Left-Down
	  center.add(-1,0,0).getBlock().setType(Material.STAINED_GLASS); //Mid-Down
	  center.getBlock().setData((byte)2);
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-Down
	  center.add(2,1,2).getBlock().setType(Material.AIR); //Left-up
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Mid-up
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-up
	  center.add(0,0,-1).getBlock().setType(Material.AIR); //Right-Mid
	  center.add(1,0,0).getBlock().setType(Material.WOOD); //Mid-Mid
	  center.getBlock().setData((byte)1);
	  center.add(1,0,0).getBlock().setType(Material.AIR); //Left-Mid
	  center.add(0,0,-1).getBlock().setType(Material.AIR); //Left-Down
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Mid-Down
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-Down
  case 2:
	  center.add(1,0,1).getBlock().setType(Material.AIR); //Left-up
	  center.add(-1,0,0).getBlock().setType(Material.WOOD); //Mid-up
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-up
	  center.add(0,0,-1).getBlock().setType(Material.WOOD); //Right-Mid
	  center.add(1,0,0).getBlock().setType(Material.WOOD); //Mid-Mid
	  center.add(1,0,0).getBlock().setType(Material.WOOD); //Left-Mid
	  center.add(0,0,-1).getBlock().setType(Material.COBBLE_WALL); //Left-Down
	  center.add(-1,0,0).getBlock().setType(Material.WOOD); //Mid-Down
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-Down
	  center.add(2,1,2).getBlock().setType(Material.AIR); //Left-up
	  center.add(-1,0,0).getBlock().setType(Material.STAINED_GLASS); //Mid-up
	  center.getBlock().setData((byte)2);
	  center.add(-1,0,0).getBlock().setType(Material.air); //Right-up
	  center.add(0,0,-1).getBlock().setType(Material.STAINED_GLASS); //Right-Mid
	  center.getBlock().setData((byte)2);
	  center.add(1,0,0).getBlock().setType(Material.WOOL); //Mid-Mid
	  center.getBlock().setData((byte)2);
	  center.add(1,0,0).getBlock().setType(Material.STAINED_GLASS); //Left-Mid
	  center.getBlock().setData((byte)2);
	  center.add(0,0,-1).getBlock().setType(Material.COBBLE_WALL); //Left-Down
	  center.add(-1,0,0).getBlock().setType(Material.STAINED_GLASS); //Mid-Down
	  center.getBlock().setData((byte)2);
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-Down
	  center.add(2,1,2).getBlock().setType(Material.AIR); //Left-up
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Mid-up
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-up
	  center.add(0,0,-1).getBlock().setType(Material.AIR); //Right-Mid
	  center.add(1,0,0).getBlock().setType(Material.WOOD); //Mid-Mid
	  center.getBlock().setData((byte)1);
	  center.add(1,0,0).getBlock().setType(Material.AIR); //Left-Mid
	  center.add(0,0,-1).getBlock().setType(Material.COBBLE_WALL); //Left-Down
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Mid-Down
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-Down
  case 3:
	  center.add(1,0,1).getBlock().setType(Material.AIR); //Left-up
	  center.add(-1,0,0).getBlock().setType(Material.WOOD); //Mid-up
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-up
	  center.add(0,0,-1).getBlock().setType(Material.WOOD); //Right-Mid
	  center.add(1,0,0).getBlock().setType(Material.WOOD); //Mid-Mid
	  center.add(1,0,0).getBlock().setType(Material.WOOD); //Left-Mid
	  center.add(0,0,-1).getBlock().setType(Material.COBBLE_WALL); //Left-Down
	  center.add(-1,0,0).getBlock().setType(Material.WOOD); //Mid-Down
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-Down
	  center.add(2,1,2).getBlock().setType(Material.AIR); //Left-up
	  center.add(-1,0,0).getBlock().setType(Material.STAINED_GLASS); //Mid-up
	  center.getBlock().setData((byte)2);
	  center.add(-1,0,0).getBlock().setType(Material.air); //Right-up
	  center.add(0,0,-1).getBlock().setType(Material.STAINED_GLASS); //Right-Mid
	  center.getBlock().setData((byte)2);
	  center.add(1,0,0).getBlock().setType(Material.WOOL); //Mid-Mid
	  center.getBlock().setData((byte)2);
	  center.add(1,0,0).getBlock().setType(Material.STAINED_GLASS); //Left-Mid
	  center.getBlock().setData((byte)2);
	  center.add(0,0,-1).getBlock().setType(Material.COBBLE_WALL); //Left-Down
	  center.add(-1,0,0).getBlock().setType(Material.STAINED_GLASS); //Mid-Down
	  center.getBlock().setData((byte)2);
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-Down
	  center.add(2,1,2).getBlock().setType(Material.AIR); //Left-up
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Mid-up
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-up
	  center.add(0,0,-1).getBlock().setType(Material.AIR); //Right-Mid
	  center.add(1,0,0).getBlock().setType(Material.WOOD); //Mid-Mid
	  center.getBlock().setData((byte)1);
	  center.add(1,0,0).getBlock().setType(Material.COBBLE_WALL); //Left-Mid
	  center.add(0,0,-1).getBlock().setType(Material.COBBLE_WALL); //Left-Down
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Mid-Down
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-Down
  case 4:
	  center.add(1,0,1).getBlock().setType(Material.AIR); //Left-up
	  center.add(-1,0,0).getBlock().setType(Material.WOOD); //Mid-up
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-up
	  center.add(0,0,-1).getBlock().setType(Material.WOOD); //Right-Mid
	  center.add(1,0,0).getBlock().setType(Material.WOOD); //Mid-Mid
	  center.add(1,0,0).getBlock().setType(Material.WOOD); //Left-Mid
	  center.add(0,0,-1).getBlock().setType(Material.COBBLE_WALL); //Left-Down
	  center.add(-1,0,0).getBlock().setType(Material.WOOD); //Mid-Down
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-Down
	  center.add(2,1,2).getBlock().setType(Material.AIR); //Left-up
	  center.add(-1,0,0).getBlock().setType(Material.STAINED_GLASS); //Mid-up
	  center.getBlock().setData((byte)2);
	  center.add(-1,0,0).getBlock().setType(Material.air); //Right-up
	  center.add(0,0,-1).getBlock().setType(Material.STAINED_GLASS); //Right-Mid
	  center.getBlock().setData((byte)2);
	  center.add(1,0,0).getBlock().setType(Material.WOOL); //Mid-Mid
	  center.getBlock().setData((byte)2);
	  center.add(1,0,0).getBlock().setType(Material.STAINED_GLASS); //Left-Mid
	  center.getBlock().setData((byte)2);
	  center.add(0,0,-1).getBlock().setType(Material.COBBLE_WALL); //Left-Down
	  center.add(-1,0,0).getBlock().setType(Material.STAINED_GLASS); //Mid-Down
	  center.getBlock().setData((byte)2);
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-Down
	  center.add(2,1,2).getBlock().setType(Material.AIR); //Left-up
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Mid-up
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-up
	  center.add(0,0,-1).getBlock().setType(Material.AIR); //Right-Mid
	  center.add(1,0,0).getBlock().setType(Material.WOOD); //Mid-Mid
	  center.getBlock().setData((byte)1);
	  center.add(1,0,0).getBlock().setType(Material.COBBLE_WALL); //Left-Mid
	  center.add(0,0,-1).getBlock().setType(Material.COBBLE_WALL); //Left-Down
	  center.add(-1,0,0).getBlock().setType(Material.COBBLE_WALL); //Mid-Down
	  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-Down
  }
 }  
}