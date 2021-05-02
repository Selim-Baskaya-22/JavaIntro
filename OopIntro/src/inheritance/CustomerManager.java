package inheritance;

public class CustomerManager {
	public void customerAdded(Customer customer) {
		System.out.println("M��teri Eklendi!." +customer.getCustomerNumber());

	}
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			customerAdded(customer);   
		}
	}
}
