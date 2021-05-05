package Managers;

import Entities.Player;
import Entities.Sale;
import Interfaces.SaleService;

public class SaleManager implements SaleService{

	@Override
	public void sale(Player player, Sale sale) {
		System.out.println(player.getFirstName() + " bought " + sale.getAmount() + " of this game.");
	}

}
