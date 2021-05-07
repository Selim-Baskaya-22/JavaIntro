package consoleUI;


import java.util.Scanner;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import business.concretes.AuthManager;
import business.concretes.EmailManager;
import business.concretes.UserManager;
import core.googleWithRegisterAdapters.GoogleManager;
import dataAccess.concretes.InMemoryUserDao;
import entities.concretes.User;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*Normalde hicbirsekilde aciklama satiri projelerimde kullanmam. Sizde elinizden geldikce kullanmayin. 
		 Cunku aciklama satiri cok kullaniliyorsa ya yazdiklarini baskasi anlamayacak diye korkuyorsundur(k�t� kod yazdi�in icin)
		 yada yazdi�in kodlar kurumsal de�ildir. Sonuc olarak ikiside ayni kapiya cikiyor ama ana mesaj� almanizi istedim.
		 Burada kullanma amac�m yeni baslayan ve konulara uzak kalan arkadaslarimiza belki yardimim dokunur diye d�s�nd�m. 
		 Insallah d�s�nd�g�m gibi olur.
		 Yildizlarsaniz sevinirim.
		 
		 DipNot: Normalde yazilarimda turkce karakterler kullan�r�m fakat github turkce karakterleri degistirdigi
		 icin bu sekil kullandim(yazi tipine gicik olan arkadaslar icin :))
		  
		 HERKESE �Y� CAL�SMALAR:):):)
		 */
		Scanner scan=new Scanner(System.in);
		//UserService userService=new UserManager(new InMemoryUserDao(),new AuthManager(),new EmailManager());
		AuthService googleManager=new GoogleManager();
	
		User user=new User();
		user.setId(1);
		user.setFirstName("Selimaa");
		user.setLastName("Ba�kaya");
		user.seteMail("selimbaskaya34@gmail.com");
    	user.setPassword("yapma1991");
		User user2=new User();
		user2.setId(2);
		user2.setFirstName("Selimaaaaaaaaaa");
	    user2.setLastName("Ba�kaya");
		user2.seteMail("selimbaskaya34@gmail.com");
    	user2.setPassword("yapma1991");
		
		
		

		UserService userService=new UserManager(new InMemoryUserDao(),new AuthManager(),new EmailManager());
		userService.getAll();
		//InMemory conctructer�nda yukar�daki mailin ayn�s� oldu�u i�in hata vericektir
		userService.add(user);
		
		int verificationCode=scan.nextInt();
		userService.userVerify(user, verificationCode);



		userService.add(user2);


	}

}
