package core.googleWithRegisterAdapters;

import business.abstracts.AuthService;
import core.utilities.BusinessRules;
import entities.concretes.User;
import signUpWithGoogle.RegisterToGoogle;

public class GoogleManager implements AuthService {

	RegisterToGoogle registerToGoogle = new RegisterToGoogle();

	@Override
	public boolean validate(User user) {
		boolean result = false;

		result = registerToGoogle.register(user.getId(), user.getFirstName(), user.getLastName(), user.geteMail(),
				user.getPassword());
		if (result != true) {
			return false;
		}
		System.out.println("Google ile kay�t olundu!");
		return true;
	}
	/*BusinessRules Yapisi;
	 * Bu yapiyi ��renmedi�imiz icin aciklama gere�i duydum. Buradaki ana yap� if mant���n� s�rekli kullanip kodlarimizi
	 spagettiye �evirmek istemedim bu yuzden ana bir kontrol mekanizmas� kurup oradan isimizi halletmeye calistim detayli 
	 bilgi icin core'daki BusinessRules' a bakiniz.  
	  */
	@Override
	public boolean login(User user) {
		boolean result=BusinessRules.Run(isFirstandLastNameEmpty(user));
		return result;
	
	}

	private boolean isFirstandLastNameEmpty(User user) {
		if (user.geteMail()==null || user.getPassword()==null) {
			System.out.println("Kullan�c� ad� veya parola eksik!");
			return false;
		}
		System.out.println("Sisteme giri� yap�ld�!");
		return true;
	}

	
}
