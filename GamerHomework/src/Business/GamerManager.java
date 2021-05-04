package Business;



import java.util.Scanner;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	
	Scanner scan=new Scanner(System.in);
	
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
	String oldNickName;
	@Override
	public void update(Gamer gamer) {
		oldNickName=gamer.getNickName();
		if (gamer.getNickName().length()>0) {
			System.out.print("Yeni Takma Ad�n�z� Girin:");
			gamer.setNickName(scan.next());
			System.out.println("G�ncelleme ��lemi Ba�ar�l�! " + gamer.getFirstName() + " " + gamer.getLastName()
			+ " Adl� Oyuncunun "+ oldNickName+" Olan Takma Ad� "+gamer.getNickName()+" G�ncellendi");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Silme ��lemi Ba�ar�l�! " + gamer.getFirstName() + " " + gamer.getLastName()
		+ " Adl� Oyuncu Silindi!");
		gamer.setFirstName(null);
		gamer.setLastName(null);
		gamer.setId(0);
		gamer.setDateOfBirth(0);
		gamer.setNationalityId(null);
		gamer.setNickName(null);
	}

	@Override
	public void listele(Gamer[] gamers) {
		System.out.println("Kay�tl� Olan Kullan�c�lar \n-------------");
		for (Gamer gamer : gamers) {
			if (gamer.getFirstName()!=null) {
				System.out.println(gamer.getFirstName());
			}
			
		}
		
	}

}
