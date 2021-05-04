package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface CampaignService {
	void campaignSale(Gamer gamer,Game game,Campaign campaign);
	
}
