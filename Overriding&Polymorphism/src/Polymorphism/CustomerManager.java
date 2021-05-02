package Polymorphism;

public class CustomerManager {
	private BaseLogger baseLogger;


	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}
 
	public void add() {
		System.out.println("M��teri eklendi");
		this.baseLogger.log("Log Mesaj�:");
	}
	
	public void MultiplyAdd(BaseLogger[] baseLogger) {
		System.out.println("M��teri eklendi");
	}
}
