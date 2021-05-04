package Business;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(game.getGameName()+" oyununu"+gamer.getFirstName()+" adl� oyuncu"+game.getUnitPrice()+"$'a sat�n ald�");
		
	}

	@Override
	public void deleteSale(Gamer gamer, Game game) {
		System.out.println(game.getGameName()+" oyununu"+gamer.getFirstName()+" adl� oyuncu �r�n� iade etti!");
		
	}

	@Override
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
		double rateCalculate=game.getUnitPrice()*campaign.getCampaignRate()/100;
		System.out.println(game.getGameName()+" oyununu"+gamer.getFirstName()+" adl� oyuncu"+game.getUnitPrice()+"fiyattan "
				+rateCalculate+"$'a sat�n ald�");
		
	}

	@Override
	public void deleteCampaignSale(Gamer gamer,Game game, Campaign campaign) {
		System.out.println(game.getGameName()+" oyununu"+gamer.getFirstName()+" adl� oyuncu �r�n� iade etti!");
		System.out.println(campaign.getCampaignName() +" adl� indirim oran� geri �ekildi. Oran: "+campaign.getCampaignRate());
	}

}
