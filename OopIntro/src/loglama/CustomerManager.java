package loglama;


public class CustomerManager {
	public void add(Customer customer,Logger logger) {
		System.out.println(customer.getFirstName()+" adlý müþteri eklendi");
		logger.log();
	}
}
