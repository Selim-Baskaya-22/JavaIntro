package loglama;

public class Main {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFirstName("Selim");
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(customer,new FileLogger());
	}

}
