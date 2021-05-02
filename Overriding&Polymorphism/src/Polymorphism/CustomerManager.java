package Polymorphism;

public class CustomerManager {
	private BaseLogger baseLogger;


	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}
 
	public void add() {
		System.out.println("Müþteri eklendi");
		this.baseLogger.log("Log Mesajý:");
	}
	
	public void MultiplyAdd(BaseLogger[] baseLogger) {
		System.out.println("Müþteri eklendi");
	}
}
