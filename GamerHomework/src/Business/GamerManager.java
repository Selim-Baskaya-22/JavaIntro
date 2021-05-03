package Business;

import java.lang.String;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void register(Gamer gamer) {
		if (!gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Ekleme iþlemi yapýlamadý! Lütfen Bilgilerinizi Kontrol Ediniz!");
		} else {
			System.out.println("Kayýt Ýþlemi Baþarýlý!\n" + gamer.getFirstName() + " " + gamer.getLastName()
					+ " Adlý Oyuncu " + gamer.getNickName() + " Takma Ad ile Kayýt Oldu");
		}

	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println("Güncelleme Ýþlemi Baþarýlý! " + gamer.getFirstName() + " " + gamer.getLastName()
		+ " Adlý Oyuncu Güncellendi");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Silme Ýþlemi Baþarýlý! " + gamer.getFirstName() + " " + gamer.getLastName()
		+ " Adlý Oyuncu Silindi!");
	}

}
