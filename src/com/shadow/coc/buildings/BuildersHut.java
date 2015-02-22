package com.shadow.coc.buildings;

import org.bukkit.Location;
import org.bukkit.Material;

public class BuildersHut extends Structure {

	@SuppressWarnings("deprecation")
	@Override
	public void Build(Location center, int level) {
		switch(level)
		{
		case 1:
		center.add(0, -1, 0).getBlock().setType(Material.STONE);
		center.add(0, -1, 0).getBlock().setData((byte)6);
		center.add(0, -1, 1).getBlock().setType(Material.STONE);
		center.add(0, -1, 1).getBlock().setData((byte)6);
		center.add(1, 0, 1).getBlock().setType(Material.LOG);
		center.add(-1, 0, 1).getBlock().setType(Material.LOG);
		center.add(1, 0, 0).getBlock().setType(Material.STONE);
		center.add(1, 0, 0).getBlock().setData((byte)6);
		center.add(-1, 0, 0).getBlock().setType(Material.STONE);
		center.add(-1, 0, 0).getBlock().setData((byte)6);
		center.add(1, 0, -1).getBlock().setType(Material.LOG);
		center.add(0, 0, -1).getBlock().setType(Material.STONE);
		center.add(0, 0, -1).getBlock().setData((byte)6);
		center.add(-1, 0, -1).getBlock().setType(Material.LOG);
		center.add(1, 1, -1).getBlock().setType(Material.LOG);
		center.add(1, 1, 1).getBlock().setType(Material.LOG);
		center.add(-1, 1, 1).getBlock().setType(Material.LOG); 
		center.add(-1, 1, -1).getBlock().setType(Material.LOG);
		center.add(1, 2, 1).getBlock().setType(Material.STEP);
		center.add(1, 2, 1).getBlock().setData((byte)5);
		center.add(1, 2, 0).getBlock().setType(Material.STEP);
		center.add(1, 2, 0).getBlock().setData((byte)5);
		center.add(1, 2, -1).getBlock().setType(Material.STEP);
		center.add(1, 2, -1).getBlock().setData((byte)5);
		center.add(0, 2, 1).getBlock().setType(Material.STEP);
		center.add(0, 2, 1).getBlock().setData((byte)13);
		center.add(0, 2, 0).getBlock().setType(Material.STEP);
		center.add(0, 2, 0).getBlock().setData((byte)13);
		center.add(0, 2, -1).getBlock().setType(Material.STEP);
		center.add(0, 2, -1).getBlock().setData((byte)13);
		center.add(-1, 2, 1).getBlock().setType(Material.LOG);
		center.add(-1, 2, -1).getBlock().setType(Material.LOG);
		center.add(-1, 3, 1).getBlock().setType(Material.STEP);
		center.add(-1, 3, 1).getBlock().setData((byte)5);
		center.add(-1, 3, 0).getBlock().setType(Material.STEP);
		center.add(-1, 3, 0).getBlock().setData((byte)5);
		center.add(-1, 3, -1).getBlock().setType(Material.STEP);
		center.add(-1, 3, -1).getBlock().setData((byte)5);
		break;
		//test
		}
	}

}
