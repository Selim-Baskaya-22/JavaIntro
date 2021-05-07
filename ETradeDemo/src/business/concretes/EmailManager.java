package business.concretes;




import java.util.Random;

import business.abstracts.EmailService;

// burada mail gönderme islemi ne kimlik kontrolü ne de user ile alakalý bir islem olmadýðý için kullandim
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
