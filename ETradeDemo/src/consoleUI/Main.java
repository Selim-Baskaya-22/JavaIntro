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
		 Cunku aciklama satiri cok kullaniliyorsa ya yazdiklarini baskasi anlamayacak diye korkuyorsundur(kötü kod yazdiðin icin)
		 yada yazdiðin kodlar kurumsal deðildir. Sonuc olarak ikiside ayni kapiya cikiyor ama ana mesajý almanizi istedim.
		 Burada kullanma amacým yeni baslayan ve konulara uzak kalan arkadaslarimiza belki yardimim dokunur diye düsündüm. 
		 Insallah düsündügüm gibi olur.
		 Yildizlarsaniz sevinirim.
		 
		 DipNot: Normalde yazilarimda turkce karakterler kullanýrým fakat github turkce karakterleri degistirdigi
		 icin bu sekil kullandim(yazi tipine gicik olan arkadaslar icin :))
		  
		 HERKESE ÝYÝ CALÝSMALAR:):):)
		 */
		Scanner scan=new Scanner(System.in);
		//UserService userService=new UserManager(new InMemoryUserDao(),new AuthManager(),new EmailManager());
		AuthService googleManager=new GoogleManager();
	
		User user=new User();
		user.setId(1);
		user.setFirstName("Selimaa");
		user.setLastName("Baþkaya");
		user.seteMail("selimbaskaya34@gmail.com");
    	user.setPassword("yapma1991");
		User user2=new User();
		user2.setId(2);
		user2.setFirstName("Selimaaaaaaaaaa");
	    user2.setLastName("Baþkaya");
		user2.seteMail("selimbaskaya34@gmail.com");
    	user2.setPassword("yapma1991");
		
		
		

		UserService userService=new UserManager(new InMemoryUserDao(),new AuthManager(),new EmailManager());
		userService.getAll();
		//InMemory conctructerýnda yukarýdaki mailin aynýsý olduðu için hata vericektir
		userService.add(user);
		
		int verificationCode=scan.nextInt();
		userService.userVerify(user, verificationCode);



		userService.add(user2);


	}

}
