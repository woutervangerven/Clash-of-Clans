package com.shadow.coc.buildings;

import org.bukkit.Location;
import org.bukkit.Material;

public class Elixertank extends Structure {

	@SuppressWarnings("deprecation")
	@Override
	public void Build(Location center, int level) {
		switch(level)
		{
		case 1:
			  center.add(1,0,1).getBlock().setType(Material.AIR); //Left-up
			  center.add(-1,0,0).getBlock().setType(Material.FENCE); //Mid-up
			  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-up
			  center.add(0,0,-1).getBlock().setType(Material.FENCE); //Right-Mid
			  center.add(1,0,0).getBlock().setType(Material.STAINED_GLASS); //Mid-Mid
			  center.getBlock().setData((byte)2);
			  center.add(1,0,0).getBlock().setType(Material.FENCE); //Left-Mid
			  center.add(0,0,-1).getBlock().setType(Material.AIR); //Left-Down
			  center.add(-1,0,0).getBlock().setType(Material.FENCE); //Mid-Down
			  center.add(-1,0,0).getBlock().setType(Material.AIR); //Right-Down
			break;
		case 2:
			center.add(1,0,1).getBlock().setType(Material.FENCE); //Left-up
			  center.add(-1,0,0).getBlock().setType(Material.AIR); //Mid-up
			  center.add(-1,0,0).getBlock().setType(Material.FENCE); //Right-up
			  center.add(0,0,-1).getBlock().setType(Material.STAINED_GLASS); //Right-Mid
			  center.getBlock().setData((byte)2);
			  center.add(1,0,0).getBlock().setType(Material.FENCE); //Mid-Mid
			  center.add(1,0,0).getBlock().setType(Material.STAINED_GLASS); //Left-Mid
			  center.getBlock().setData((byte)2);
			  center.add(0,0,-1).getBlock().setType(Material.FENCE); //Left-Down
			  center.add(-1,0,0).getBlock().setType(Material.AIR); //Mid-Down
			  center.add(-1,0,0).getBlock().setType(Material.FENCE); //Right-Down
			break;
		case 3:
			center.add(1,0,1).getBlock().setType(Material.FENCE); //Left-up
			  center.add(-1,0,0).getBlock().setType(Material.STAINED_GLASS); //Mid-up
			  center.getBlock().setData((byte)2);
			  center.add(-1,0,0).getBlock().setType(Material.FENCE); //Right-up
			  center.add(0,0,-1).getBlock().setType(Material.STAINED_GLASS); //Right-Mid
			  center.getBlock().setData((byte)2);
			  center.add(1,0,0).getBlock().setType(Material.FENCE); //Mid-Mid
			  center.add(1,0,0).getBlock().setType(Material.STAINED_GLASS); //Left-Mid
			  center.getBlock().setData((byte)2);
			  center.add(0,0,-1).getBlock().setType(Material.FENCE); //Left-Down
			  center.add(-1,0,0).getBlock().setType(Material.AIR); //Mid-Down
			  center.add(-1,0,0).getBlock().setType(Material.FENCE); //Right-Down
			break;
		case 4:
			center.add(1,0,1).getBlock().setType(Material.FENCE); //Left-up
			  center.add(-1,0,0).getBlock().setType(Material.STAINED_GLASS); //Mid-up
			  center.getBlock().setData((byte)2);
			  center.add(-1,0,0).getBlock().setType(Material.FENCE); //Right-up
			  center.add(0,0,-1).getBlock().setType(Material.STAINED_GLASS); //Right-Mid
			  center.getBlock().setData((byte)2);
			  center.add(1,0,0).getBlock().setType(Material.FENCE); //Mid-Mid
			  center.add(1,0,0).getBlock().setType(Material.STAINED_GLASS); //Left-Mid
			  center.getBlock().setData((byte)2);
			  center.add(0,0,-1).getBlock().setType(Material.FENCE); //Left-Down
			  center.add(-1,0,0).getBlock().setType(Material.STAINED_GLASS); //Mid-Down
			  center.getBlock().setData((byte)2);
			  center.add(-1,0,0).getBlock().setType(Material.FENCE); //Right-Down
			break;
		case 5:
			center.add(0, 0, 0).getBlock().setType(Material.STAINED_GLASS);
			center.add(0, 0, 0).getBlock().setData((byte)2);
			center.add(1, 0, 0).getBlock().setType(Material.FENCE);
			center.add(0, 0, 1).getBlock().setType(Material.FENCE);
			center.add(-1, 0, 0).getBlock().setType(Material.FENCE);
			center.add(0, 0, -1).getBlock().setType(Material.FENCE);
			center.add(0, 1, 0).getBlock().setType(Material.STAINED_GLASS);
			center.add(0, 1, 0).getBlock().setData((byte)2);
			break;
		case 6:
			center.add(0, 0, 0).getBlock().setType(Material.STAINED_GLASS);
			center.add(0, 0, 0).getBlock().setData((byte)2);
			center.add(1, 0, 0).getBlock().setType(Material.FENCE);
			center.add(0, 0, 1).getBlock().setType(Material.FENCE);
			center.add(-1, 0, 0).getBlock().setType(Material.FENCE);
			center.add(0, 0, -1).getBlock().setType(Material.FENCE);
			center.add(0, 1, 0).getBlock().setType(Material.STAINED_GLASS);
			center.add(0, 1, 0).getBlock().setData((byte)2);
			center.add(0, 1, 1).getBlock().setType(Material.STAINED_GLASS);
			center.add(0, 1, 1).getBlock().setData((byte)2);
			center.add(0, 1, -1).getBlock().setType(Material.STAINED_GLASS);
			center.add(0, 1, -1).getBlock().setData((byte)2);
			break;
			
		}
	}
}
