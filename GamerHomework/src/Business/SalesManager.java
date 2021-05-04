package Business;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(game.getGameName()+" oyununu"+gamer.getFirstName()+" adlý oyuncu"+game.getUnitPrice()+"$'a satýn aldý");
		
	}

	@Override
	public void deleteSale(Gamer gamer, Game game) {
		System.out.println(game.getGameName()+" oyununu"+gamer.getFirstName()+" adlý oyuncu ürünü iade etti!");
		
	}

	@Override
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
		double rateCalculate=game.getUnitPrice()*campaign.getCampaignRate()/100;
		System.out.println(game.getGameName()+" oyununu"+gamer.getFirstName()+" adlý oyuncu"+game.getUnitPrice()+"fiyattan "
				+rateCalculate+"$'a satýn aldý");
		
	}

	@Override
	public void deleteCampaignSale(Gamer gamer,Game game, Campaign campaign) {
		System.out.println(game.getGameName()+" oyununu"+gamer.getFirstName()+" adlý oyuncu ürünü iade etti!");
		System.out.println(campaign.getCampaignName() +" adlý indirim oraný geri çekildi. Oran: "+campaign.getCampaignRate());
	}

}
