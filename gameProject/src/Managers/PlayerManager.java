package Managers;

import Entities.Player;
import Interfaces.PlayerService;

public class PlayerManager implements PlayerService{

	private PlayerCheckManager playerCheckManager;
	
	public PlayerManager(PlayerCheckManager playerCheckManager) {
		this.playerCheckManager = playerCheckManager;
	}
	
	@Override
	public void register(Player player) {
		if (playerCheckManager.iAmNotRobot(player) == true) {
			System.out.println("Registered : " + player.getFirstName() + " " + player.getLastName());
		}
		
	}

	@Override
	public void update(Player player) {
		if (playerCheckManager.iAmNotRobot(player) == true) {
			System.out.println("Updated : " + player.getFirstName() + " " + player.getLastName());
		}
		
	}

	@Override
	public void delete(Player player) {
		if (playerCheckManager.iAmNotRobot(player) == true) {
			System.out.println("Deleted : " + player.getFirstName() + " " + player.getLastName());
		}
		
	}

}
