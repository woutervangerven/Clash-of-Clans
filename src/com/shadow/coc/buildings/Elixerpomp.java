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
   center.add(0, 0, 0).getBlock().setType(Material.WOOD);
   center.add(0, 1, 0).getBlock().setType(Material.STAINED_GLASS);
   center.add(0, 1, 0).getBlock().setData((byte)2);
   center.add(0, 2, 0).getBlock().setType(Material.WOOD);
   center.add(1, 0, 0).getBlock().setType(Material.WOOD);
   center.add(0, 0, 1).getBlock().setType(Material.WOOD);
   center.add(-1, 0, 0).getBlock().setType(Material.WOOD);
   center.add(0, 0, -1).getBlock().setType(Material.WOOD);
   center.add(1, 1, 0).getBlock().setType(Material.STAINED_GLASS);
   center.add(1, 1, 0).getBlock().setData((byte)2);
   center.add(0, 1, 1).getBlock().setType(Material.STAINED_GLASS);
   center.add(1, 1, 1).getBlock().setData((byte)2);
   center.add(-1, 1, 0).getBlock().setType(Material.STAINED_GLASS);
   center.add(-1, 1, 0).getBlock().setData((byte)2);
   center.add(0, 1, -1).getBlock().setType(Material.STAINED_GLASS);
   center.add(0, 1, -1).getBlock().setData((byte)2);
   center.add(-1, 0, 1).getBlock().setType(Material.COBBLE_WALL);
   center.add(-1, 1, 1).getBlock().setType(Material.COBBLE_WALL);
   break;
  case 2:
	   center.add(0, 0, 0).getBlock().setType(Material.WOOD);
	   center.add(0, 1, 0).getBlock().setType(Material.STAINED_GLASS);
	   center.add(0, 1, 0).getBlock().setData((byte)2);
	   center.add(0, 2, 0).getBlock().setType(Material.WOOD);
	   center.add(1, 0, 0).getBlock().setType(Material.WOOD);
	   center.add(0, 0, 1).getBlock().setType(Material.WOOD);
	   center.add(-1, 0, 0).getBlock().setType(Material.WOOD);
	   center.add(0, 0, -1).getBlock().setType(Material.WOOD);
	   center.add(1, 1, 0).getBlock().setType(Material.STAINED_GLASS);
	   center.add(1, 1, 0).getBlock().setData((byte)2);
	   center.add(0, 1, 1).getBlock().setType(Material.STAINED_GLASS);
	   center.add(1, 1, 1).getBlock().setData((byte)2);
	   center.add(-1, 1, 0).getBlock().setType(Material.STAINED_GLASS);
	   center.add(-1, 1, 0).getBlock().setData((byte)2);
	   center.add(0, 1, -1).getBlock().setType(Material.STAINED_GLASS);
	   center.add(0, 1, -1).getBlock().setData((byte)2);
	   center.add(-1, 0, 1).getBlock().setType(Material.COBBLE_WALL);
	   center.add(-1, 1, 1).getBlock().setType(Material.COBBLE_WALL);
	   center.add(-1, 2, 1).getBlock().setType(Material.COBBLE_WALL);
	   break;
  case 3:
	   center.add(0, 0, 0).getBlock().setType(Material.WOOD);
	   center.add(0, 1, 0).getBlock().setType(Material.STAINED_GLASS);
	   center.add(0, 1, 0).getBlock().setData((byte)2);
	   center.add(0, 2, 0).getBlock().setType(Material.WOOD);
	   center.add(1, 0, 0).getBlock().setType(Material.WOOD);
	   center.add(0, 0, 1).getBlock().setType(Material.WOOD);
	   center.add(-1, 0, 0).getBlock().setType(Material.WOOD);
	   center.add(0, 0, -1).getBlock().setType(Material.WOOD);
	   center.add(1, 1, 0).getBlock().setType(Material.STAINED_GLASS);
	   center.add(1, 1, 0).getBlock().setData((byte)2);
	   center.add(0, 1, 1).getBlock().setType(Material.STAINED_GLASS);
	   center.add(1, 1, 1).getBlock().setData((byte)2);
	   center.add(-1, 1, 0).getBlock().setType(Material.STAINED_GLASS);
	   center.add(-1, 1, 0).getBlock().setData((byte)2);
	   center.add(0, 1, -1).getBlock().setType(Material.STAINED_GLASS);
	   center.add(0, 1, -1).getBlock().setData((byte)2);
	   center.add(-1, 0, 1).getBlock().setType(Material.COBBLE_WALL);
	   center.add(-1, 1, 1).getBlock().setType(Material.COBBLE_WALL);
	   center.add(-1, 2, 1).getBlock().setType(Material.COBBLE_WALL);
	   center.add(0, 2, 1).getBlock().setType(Material.COBBLE_WALL);
	   break;
  }
 }  
}