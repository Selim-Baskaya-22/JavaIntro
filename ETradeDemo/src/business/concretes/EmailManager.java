package business.concretes;




import java.util.Random;

import business.abstracts.EmailService;

// burada mail g�nderme islemi ne kimlik kontrol� ne de user ile alakal� bir islem olmad��� i�in kullandim
public class EmailManager implements EmailService{
	int verificationCode;
	public EmailManager() {
		Random a=new Random();
		this.verificationCode= a.nextInt(1000)*10;
	}
	@Override
	public int mailSend() {		
		return this.verificationCode;
	}

}
