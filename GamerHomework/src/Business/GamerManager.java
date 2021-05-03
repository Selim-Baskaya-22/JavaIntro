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
			System.out.println("Ekleme i�lemi yap�lamad�! L�tfen Bilgilerinizi Kontrol Ediniz!");
		} else {
			System.out.println("Kay�t ��lemi Ba�ar�l�!\n" + gamer.getFirstName() + " " + gamer.getLastName()
					+ " Adl� Oyuncu " + gamer.getNickName() + " Takma Ad ile Kay�t Oldu");
		}

	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println("G�ncelleme ��lemi Ba�ar�l�! " + gamer.getFirstName() + " " + gamer.getLastName()
		+ " Adl� Oyuncu G�ncellendi");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Silme ��lemi Ba�ar�l�! " + gamer.getFirstName() + " " + gamer.getLastName()
		+ " Adl� Oyuncu Silindi!");
	}

}
