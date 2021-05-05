package Managers;

import Entities.Game;
import Interfaces.GameService;

public class GameManager implements GameService{

	@Override
	public void update(Game game) {
		System.out.println("Game updated.");
		
	}
	
}
