package loglama;

public class EmailLogger extends Logger {
	@Override
	public void log() {
		super.log();
		System.out.println("Email gönderildi");
	}
}
