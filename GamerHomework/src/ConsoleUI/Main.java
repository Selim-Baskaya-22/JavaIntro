package ConsoleUI;

import java.util.Scanner;

import Adapters.MernisServiceAdapter;
import Business.GamerManager;
import Entities.Gamer;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		MernisServiceAdapter adapter=new MernisServiceAdapter();
		Scanner scan = new Scanner(System.in);
		boolean checkIf=false;
		Gamer gamer = new Gamer();
		
		while (checkIf==false) {
			System.out.println("Kullan�c� Kay�t Ekran�\n----------------");
			System.out.print("�sminizi Giriniz:");
			gamer.setFirstName(scan.next());

			System.out.print("Soyad�n�z� Giriniz:");
			gamer.setLastName(scan.next());

			System.out.print("Tc Giriniz:");
			gamer.setNationalityId(scan.next());

			System.out.print("Kullan�c� �sminizi(nickname) Giriniz:");
			gamer.setNickName(scan.next());

			System.out.print("Do�um Tarihi(y�l olarak) Giriniz:");
			gamer.setDateOfBirth(scan.nextInt());
			checkIf=adapter.checkIfRealPerson(gamer);
			System.out.println("----------------");
		}
		

		Gamer[] gamers = { gamer };
		int cikis;
		GamerManager checkService = new GamerManager(new MernisServiceAdapter());
		System.out.print("Men�ye gitmek i�in herhangi bir say�ya bas�n�z(0 hari�): ");
		cikis = scan.nextInt();
		while (cikis != 0) {
			System.out.println("-------Men�-------");
			System.out.println("Kay�t olmak i�in 1'e bas�n�z: ");
			System.out.println("G�ncellemek i�in 2'ye bas�n�z: ");
			System.out.println("Silmek i�in 3'e bas�n�z: ");
			System.out.println("Kay�tlar� listelemek i�in 4'e bas�n�z: ");
			System.out.println("��k�� i�in 0'a bas�n�z: ");
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
		}
		System.out.println("��k�� Yapt�n�z!!!");
	}

}
