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
			center.add(0,-1,0).getBlock().setType(Material.STONE);
			center.getBlock().setData((byte)6);
			center.add(0,0,-1).getBlock().setType(Material.STONE);
			center.getBlock().setData((byte)6);
			center.add(1,1,2).getBlock().setType(Material.LOG); //Left-up
			  center.add(-1,0,0).getBlock().setType(Material.STONE); //Mid-up
			  center.getBlock().setData((byte)6);
			  center.add(-1,0,0).getBlock().setType(Material.LOG); //Right-up
			  center.add(0,0,-1).getBlock().setType(Material.STONE); //Right-Mid
			  center.getBlock().setData((byte)6);
			  center.add(1,0,0).getBlock().setType(Material.AIR); //Mid-Mid
			  center.add(1,0,0).getBlock().setType(Material.STONE); //Left-Mid
			  center.getBlock().setData((byte)6);
			  center.add(0,0,-1).getBlock().setType(Material.LOG); //Left-Down
			  center.add(-1,0,0).getBlock().setType(Material.AIR); //Mid-Down
			  center.add(-1,0,0).getBlock().setType(Material.LOG); //Right-Down
			  center.add(2,1,2).getBlock().setType(Material.LOG); //Left-up
			  center.add(-1,0,0).getBlock().setType(Material.AIR); //Mid-up
			  center.add(-1,0,0).getBlock().setType(Material.LOG); //Right-up
			  center.add(0,0,-1).getBlock().setType(Material.AIR); //Right-Mid
			  center.add(1,0,0).getBlock().setType(Material.AIR); //Mid-Mid
			  center.add(1,0,0).getBlock().setType(Material.AIR); //Left-Mid
			  center.add(0,0,-1).getBlock().setType(Material.LOG); //Left-Down
			  center.add(-1,0,0).getBlock().setType(Material.AIR); //Mid-Down
			  center.add(-1,0,0).getBlock().setType(Material.LOG); //Right-Down
			  center.add(2,1,2).getBlock().setType(Material.LOG); //Left-up
			  center.add(-1,0,0).getBlock().setType(Material.STONE); //Mid-up
			  center.getBlock().setData((byte)6);
			  center.add(-1,0,0).getBlock().setType(Material.LOG); //Right-up
			  center.add(0,0,-1).getBlock().setType(Material.STEP); //Right-Mid
			  center.getBlock().setData((byte)13);
			  center.add(1,0,0).getBlock().setType(Material.STEP); //Mid-Mid
			  center.getBlock().setData((byte)13);
			  center.add(1,0,0).getBlock().setType(Material.STEP); //Left-Mid
			  center.getBlock().setData((byte)13);
			  center.add(0,0,-1).getBlock().setType(Material.STEP); //Left-Down
			  center.getBlock().setData((byte)5);
			  center.add(-1,0,0).getBlock().setType(Material.STEP); //Mid-Down
			  center.getBlock().setData((byte)5);
			  center.add(-1,0,0).getBlock().setType(Material.STEP); //Right-Down
			  center.getBlock().setData((byte)5);
			  center.add(2,1,2).getBlock().setType(Material.STEP); //Left-up
			  center.getBlock().setData((byte)5);
			  center.add(-1,0,0).getBlock().setType(Material.STEP); //Mid-up
			  center.getBlock().setData((byte)5);
			  center.add(-1,0,0).getBlock().setType(Material.STEP); //Right-up
			  center.getBlock().setData((byte)5);
		break;
		//test
		}
	}

}
