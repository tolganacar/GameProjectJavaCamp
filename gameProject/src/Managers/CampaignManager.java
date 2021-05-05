package Managers;

import Entities.Campaign;
import Interfaces.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " campaign has been added with %" + campaign.getDiscount() + " discount.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " campaign has been updated.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " campaign has been deleted.");
		
	}
	
}
