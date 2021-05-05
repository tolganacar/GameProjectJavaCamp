package Managers;

import Entities.Player;
import Interfaces.PlayerCheckService;

public class PlayerCheckManager implements PlayerCheckService{

	public boolean iAmNotRobot(Player player) {
		if (player.getTcNo().length() == 11) {
			System.out.println("Robot Testi Geçildi" + " " + player.getFirstName());
			return true;
		} else {
			System.out.println("Robot Testi Geçilemedi" + " " + player.getFirstName());
			return false;
		}
	}

}
