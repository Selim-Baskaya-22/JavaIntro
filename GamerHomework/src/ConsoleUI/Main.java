package ConsoleUI;

import java.util.Scanner;

import Adapters.MernisServiceAdapter;
import Business.GameManager;
import Business.GamerManager;
import Business.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		MernisServiceAdapter adapter=new MernisServiceAdapter();
		Scanner scan = new Scanner(System.in);
		boolean checkIf=false;
		Gamer gamer = new Gamer();
		
		while (checkIf==false) {
			System.out.println("Kullanýcý Kayýt Ekraný\n----------------");
			System.out.print("Ýsminizi Giriniz:");
			gamer.setFirstName(scan.next());

			System.out.print("Soyadýnýzý Giriniz:");
			gamer.setLastName(scan.next());

			System.out.print("Tc Giriniz:");
			gamer.setNationalityId(scan.next());

			System.out.print("Kullanýcý Ýsminizi(nickname) Giriniz:");
			gamer.setNickName(scan.next());

			System.out.print("Doðum Tarihi(yýl olarak) Giriniz:");
			gamer.setDateOfBirth(scan.nextInt());
			checkIf=adapter.checkIfRealPerson(gamer);
			System.out.println("----------------");
		}
		

		Gamer[] gamers = { gamer };
		
		Game game=new Game();
		game.setGameId(1);
		game.setGameName("League Of Legends");
		game.setUnitPrice(100);
		
		Game[] games= {game};
		GameManager gameManager=new GameManager();
		gameManager.add(game);

		

		int cikis;
		GamerManager checkService = new GamerManager(new MernisServiceAdapter());
		System.out.print("Menüye gitmek için herhangi bir sayýya basýnýz(0 hariç): ");
		cikis = scan.nextInt();
		while (cikis != 0) {
			System.out.println("-------Menü-------");
			System.out.println("Kayýt olmak için 1'e basýnýz: ");
			System.out.println("Güncellemek için 2'ye basýnýz: ");
			System.out.println("Silmek için 3'e basýnýz: ");
			System.out.println("Kayýtlarý listelemek için 4'e basýnýz: ");
			System.out.println("Oyunlarý listelemek için 5'e basýnýz: ");
			System.out.println("Çýkýþ için 0'a basýnýz: ");
			cikis = scan.nextInt();
			System.out.println("------------------");
			if (cikis == 1)
				checkService.register(gamer);
			else if (cikis == 2)
				checkService.update(gamer);
			else if (cikis == 3)
				checkService.delete(gamer);			
			else if (cikis == 4)
				checkService.listele(gamers);
			else if (cikis == 5)
				gameManager.getAll(games);
		}
		System.out.println("Çýkýþ Yaptýnýz!!!");
		System.out.println("Satýn alma iþlemlerine yönlendiriliyorsunuz...");
		
		Campaign campaign=new Campaign();
		campaign.setId(1);
		campaign.setCampaignName("Kýþ Sezonu Ýndirimleri");
		campaign.setCampaignRate(20);
		SalesManager manager=new SalesManager();
		manager.sale(gamer, game);
		manager.campaignSale(gamer, game, campaign);
		
	}

}
