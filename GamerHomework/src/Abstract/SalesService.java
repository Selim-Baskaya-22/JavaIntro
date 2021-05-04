package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SalesService {
		void campaignSale(Gamer gamer,Game game,Campaign campaign);
		void sale(Gamer gamer,Game game);
		void deleteSale(Gamer gamer,Game game);
		void deleteCampaignSale(Gamer gamer,Game game,Campaign campaign);
}
