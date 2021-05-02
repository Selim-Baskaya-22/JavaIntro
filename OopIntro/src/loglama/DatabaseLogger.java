package loglama;


public class DatabaseLogger extends Logger {
	@Override
	public void log() {
		super.log();
		System.out.println("Database loglandý");
	}
}
