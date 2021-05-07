package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.AuthService;
import business.abstracts.EmailService;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	/*Neden 3 tane constructer?
	 UserDao: Burada userdao benim ekleme silme islemimi getirmesi icin kullandim 
	 AuthService: Tamam verilerim eklensin fakat dogrulamardan gecis yapabilecekmi 
	 EmailService: Eklendikten sonra dogrulama icin mail gelmesi lazim 
	 
	 Arkadaslar yapilar yogurt yiyise göre deðisir burada önemli olan sey bizim ihtiyacýmýz neler? Ben bu uygulamada 
	 ihtiyacim olan seyleri abartmadan ekstra birsey eklemeden kullandim. %100 dogru diyemem ama 1 yýl sonra bu kodu 
	 okudugumda anlarim diyebilirim. Lütfen sizde bu mantikta düsünün.Ýyi calismalar dilerim :).
	 (aciklamalari okuduktan sonra main classinada bakmanizi tavsiye ederim)
	 */

	
	private UserDao userDao;
	private AuthService authService;
	private EmailService emailService;
	
	public UserManager(UserDao userDao, AuthService authService, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
		this.emailService = emailService;
	}


	List<User> users=new ArrayList<User>();
	public UserManager() {
		users.add((User) this.getAll());
	}

	//ekleme islemi yaparken öncelikle kimlik kontrolundeki sartlardan geciyormu diye teste tabi tutuyoruz.
	@Override
	public void add(User user) {
		if (userCheck(user.geteMail()) &&authService.validate(user)) {
			userDao.add(user);
			System.out.println("Doðrulama Kodunuz Mail Olarak Gönderildi! Doðrulama Kodunuz: "+emailService.mailSend());
			System.out.print("Doðrulama Kodunu Giriniz: ");
			return;			
		}
		System.out.println("Kullanýcý Bilgilerini Kontrol Ediniz!");
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public User get(int id) {
		User result=this.userDao.get(id);
		return result;
	}

	@Override
	public List<User> getAll() {
		List<User> result=this.userDao.getAll();
		return result;
	}

	//kimlik kayit olan bir kullanici kimlik dogrulamasi icin gelen random rakamlari dogru girmesi icin karar yapisi koydum
	@Override
	public void userVerify(User user,int verificationCode) {
		int result=emailService.mailSend();
		if (result==verificationCode) {
			
			System.out.println("Kullanýcý doðrulandý. Üyeliðiniz Tamamlandý!!! "+user.getFirstName());
		}
		else {
			System.out.println("Doðrulama kodunuz yanlýþ!");
		}
		
	}
	public boolean userCheck(String mail) {
		if (userDao.getEmail(mail)!=null) {
			System.out.println("Kullanýcý mevcut!");
			return false;
		}
	
	

		
		return true;
	}

}
