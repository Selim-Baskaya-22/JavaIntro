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
	 
	 Arkadaslar yapilar yogurt yiyise g�re de�isir burada �nemli olan sey bizim ihtiyac�m�z neler? Ben bu uygulamada 
	 ihtiyacim olan seyleri abartmadan ekstra birsey eklemeden kullandim. %100 dogru diyemem ama 1 y�l sonra bu kodu 
	 okudugumda anlarim diyebilirim. L�tfen sizde bu mantikta d�s�n�n.�yi calismalar dilerim :).
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

	//ekleme islemi yaparken �ncelikle kimlik kontrolundeki sartlardan geciyormu diye teste tabi tutuyoruz.
	@Override
	public void add(User user) {
		if (userCheck(user.geteMail()) &&authService.validate(user)) {
			userDao.add(user);
			System.out.println("Do�rulama Kodunuz Mail Olarak G�nderildi! Do�rulama Kodunuz: "+emailService.mailSend());
			System.out.print("Do�rulama Kodunu Giriniz: ");
			return;			
		}
		System.out.println("Kullan�c� Bilgilerini Kontrol Ediniz!");
		
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
			
			System.out.println("Kullan�c� do�ruland�. �yeli�iniz Tamamland�!!! "+user.getFirstName());
		}
		else {
			System.out.println("Do�rulama kodunuz yanl��!");
		}
		
	}
	public boolean userCheck(String mail) {
		if (userDao.getEmail(mail)!=null) {
			System.out.println("Kullan�c� mevcut!");
			return false;
		}
	
	

		
		return true;
	}

}
