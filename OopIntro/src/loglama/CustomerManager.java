package loglama;


public class CustomerManager {
	public void add(Customer customer,Logger logger) {
		System.out.println(customer.getFirstName()+" adl� m��teri eklendi");
		logger.log();
	}
}
