package gameProject;

import Entities.Campaign;
import Entities.Player;
import Entities.Sale;
import Managers.CampaignManager;
import Managers.PlayerCheckManager;
import Managers.PlayerManager;
import Managers.SaleManager;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player(1,"Tolga","Nacar","1999","00000000000");
		Player player2 = new Player(2,"Engin","Demiroð","1985","00000000000");
		
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
		playerManager.register(player1);
		playerManager.update(player1);
		playerManager.delete(player1);
		
		Campaign campaign1 = new Campaign(1,"The Biggest Campaign",50);
		Campaign campaign2 = new Campaign(2,"Summer Campaign",35);
		

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign2);
		campaignManager.delete(campaign1);
		
		Sale sale = new Sale(1,1,50,1);
		SaleManager saleManager = new SaleManager();
		saleManager.sale(player1, sale);
		
	}

}
