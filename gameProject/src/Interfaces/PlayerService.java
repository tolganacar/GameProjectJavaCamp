package Interfaces;

import Entities.Player;

public interface PlayerService {
	void register(Player player);
	void update(Player player);
	void delete(Player player);
	
}
