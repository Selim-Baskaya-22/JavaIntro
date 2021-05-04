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
			System.out.println("Ekleme iþlemi yapýlamadý! Lütfen Bilgilerinizi Kontrol Ediniz!");
		} else {
			System.out.println("Kayýt Ýþlemi Baþarýlý!\n" + gamer.getFirstName() + " " + gamer.getLastName()
					+ " Adlý Oyuncu " + gamer.getNickName() + " Takma Ad ile Kayýt Oldu");
		}

	}
	String oldNickName;
	@Override
	public void update(Gamer gamer) {
		oldNickName=gamer.getNickName();
		if (gamer.getNickName().length()>0) {
			System.out.print("Yeni Takma Adýnýzý Girin:");
			gamer.setNickName(scan.next());
			System.out.println("Güncelleme Ýþlemi Baþarýlý! " + gamer.getFirstName() + " " + gamer.getLastName()
			+ " Adlý Oyuncunun "+ oldNickName+" Olan Takma Adý "+gamer.getNickName()+" Güncellendi");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Silme Ýþlemi Baþarýlý! " + gamer.getFirstName() + " " + gamer.getLastName()
		+ " Adlý Oyuncu Silindi!");
		gamer.setFirstName(null);
		gamer.setLastName(null);
		gamer.setId(0);
		gamer.setDateOfBirth(0);
		gamer.setNationalityId(null);
		gamer.setNickName(null);
	}

	@Override
	public void listele(Gamer[] gamers) {
		System.out.println("Kayýtlý Olan Kullanýcýlar \n-------------");
		for (Gamer gamer : gamers) {
			if (gamer.getFirstName()!=null) {
				System.out.println(gamer.getFirstName());
			}
			
		}
		
	}

}
