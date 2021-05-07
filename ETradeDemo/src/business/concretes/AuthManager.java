package business.concretes;

import java.util.regex.Pattern;

import business.abstracts.AuthService;

import core.utilities.BusinessRules;
import entities.concretes.User;

public class AuthManager implements AuthService{

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	
	/*BusinessRules Yapisi;
	 * Bu yapiyi öðrenmediðimiz icin aciklama gereði duydum. Buradaki ana yapý if mantýðýný sürekli kullanip kodlarimizi
	 spagettiye çevirmek istemedim bu yuzden ana bir kontrol mekanizmasý kurup oradan isimizi halletmeye calistim detayli 
	 bilgi icin core'daki BusinessRules' a bakiniz.  
	  */
	@Override
	public boolean validate(User user) {
		boolean result=BusinessRules.Run(ifPasswordCheckLength(user),
				ifFirstNameCheckLength(user),
				ifLastNameCheckLength(user),
				ifEmailFormatCheckValid(user));
		return result;
	}
	
	private boolean ifPasswordCheckLength(User user) {
		if (user.getPassword().length()<6) {
			System.out.println("Parola en az 6 karakter olmalýdýr!");
			return false;
		}
		return true;
	}
	
	private boolean ifFirstNameCheckLength(User user) {
		if (user.getFirstName().length()<2) {
			System.out.println("Ýsim en az 2 karakter olmalýdýr!");
			return false;
		}
		return true;
	}
	private boolean ifLastNameCheckLength(User user) {
		if (user.getLastName().length()<2) {
			System.out.println("Soyad en az 2 karakter olmalýdýr!");
			return false;
		}
		return true;
	}
	private boolean ifEmailFormatCheckValid(User email) {
		return VALID_EMAIL_ADDRESS_REGEX.matcher(email.geteMail()).find();
	}

	@Override
	public boolean login(User user) {
		boolean result=BusinessRules.Run(isFirstandLastNameEmpty(user));
		return result;
	
	}

	private boolean isFirstandLastNameEmpty(User user) {
		if (user.geteMail()==null || user.getPassword()==null) {
			System.out.println("Kullanýcý adý veya parola eksik!");
			return false;
		}
		System.out.println("Sisteme giriþ yapýldý!");
		return true;
	}
}
