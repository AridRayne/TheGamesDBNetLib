package net.thegamesdb.test;
import net.thegamesdb.lib.GameData;
import net.thegamesdb.lib.PlatformData;
import net.thegamesdb.lib.Utilities;


public class main {

	public static void main(String[] args) {
		//PlatformItem t = new PlatformItem(15);
		PlatformData t = Utilities.PlatformFromID(15);
		System.out.println(t.platform.id);
		GameData g = Utilities.GameFromID(2);
		System.out.println(g.games.get(0).id);
	}

}
