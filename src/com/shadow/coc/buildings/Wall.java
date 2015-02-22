package com.shadow.coc.buildings;

import org.bukkit.Location;
import org.bukkit.Material;

public class Wall extends Structure {

	@SuppressWarnings("deprecation")
	@Override
	public void Build(Location center, int level) {
		switch(level)
		{
		case 1:
			center.add(0, 0, 0).getBlock().setType(Material.LOG);
			center.add(0, 0, 0).getBlock().setData((byte)1);
			center.add(0, 1, 0).getBlock().setType(Material.FENCE);
			break;
		case 2:
			center.add(0, 0, 0).getBlock().setType(Material.STONE);
			center.add(0, 1, 0).getBlock().setType(Material.STEP);
			center.add(0, 1, 0).getBlock().setData((byte)5);
			break;
		case 3:
			center.add(0, 0, 0).getBlock().setType(Material.ANVIL);
			center.add(0, 1, 0).getBlock().setType(Material.STEP);
			center.add(0, 1, 0).getBlock().setData((byte)5);
			break;
		case 4:
			center.getBlock().setType(Material.IRON_BARDING);
			center.add(0, 1, 0).getBlock().setType(Material.IRON_BARDING);
			break;
		case 5:
			center.getBlock().setType(Material.SANDSTONE);
			center.getBlock().setData((byte)2);
			center.add(0, 1, 0).getBlock().setType(Material.STEP);
			center.add(0, 1, 0).getBlock().setData((byte)1);
			break;
		case 6:
			center.getBlock().setType(Material.STAINED_GLASS);
			center.getBlock().setData((byte)2);
			center.add(0, 1, 0).getBlock().setType(Material.STAINED_GLASS_PANE);
			center.add(0, 1, 0).getBlock().setData((byte)2);
			break;
		case 7:
			center.getBlock().setType(Material.STAINED_GLASS);
			center.getBlock().setData((byte)10);
			center.add(0, 1, 0).getBlock().setType(Material.STAINED_GLASS_PANE);
			center.add(0, 1, 0).getBlock().setData((byte)10);
			break;
		case 8:
			center.add(0, 0, 0).getBlock().setType(Material.ANVIL);
			center.add(0, 1, 0).getBlock().setType(Material.SKULL);
			center.add(0, 1, 0).getBlock().setData((byte)1);
			break;
		case 9:
			center.getBlock().setType(Material.STONE);
			center.getBlock().setData((byte)6);
			center.add(0, 1, 0).getBlock().setType(Material.STONE);
			center.add(0, 1, 0).getBlock().setData((byte)6);
			break;
		case 10:
			center.getBlock().setType(Material.STONE);
			center.getBlock().setData((byte)6);
			center.add(0, 1, 0).getBlock().setType(Material.IRON_BARDING);
			break;
		case 11:
			center.add(0, 0, 0).getBlock().setType(Material.ANVIL);
			center.add(0, -1, 0).getBlock().setType(Material.SEA_LANTERN);
			center.add(0, 1, 0).getBlock().setType(Material.COBBLE_WALL);
			break;
		}
	}

}
