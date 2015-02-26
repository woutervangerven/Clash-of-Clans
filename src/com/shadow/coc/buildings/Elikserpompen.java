package com.shadow.coc.buildings;

import org.bukkit.Location;
import org.bukkit.Material;

public class Elixerpompen extends Structure {
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
			center.add(0, 2, 0).getBlock().setData((byte)1);
			center.add(1, 0, 0).getBlock().setType(Material.WOOD);
			center.add(0, 0, 1).getBlock().setType(Material.WOOD);
			center.add(-1, 0, 0).getBlock().setType(Material.WOOD);
			center.add(0, 0, -1).getBlock().setType(Material.WOOD);
			center.add(1, 0, 0).getBlock().setType(Material.STAINED_GLASS);
			center.add(1, 0, 0).getBlock().setData((byte)2);
			break;
		}
	}		
}
