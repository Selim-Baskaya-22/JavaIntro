package Polymorphism;

public class Main {

	public static void main(String[] args) {
		BaseLogger[] baseLogger=new BaseLogger[] {new FileLogger(),new DatabaseLogger()};
		for (BaseLogger logger : baseLogger) {
			logger.log("Log mesajý: ");
		}
		
		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
