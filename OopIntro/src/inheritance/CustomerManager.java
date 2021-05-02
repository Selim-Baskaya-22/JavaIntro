package inheritance;

public class CustomerManager {
	public void customerAdded(Customer customer) {
		System.out.println("Müþteri Eklendi!." +customer.getCustomerNumber());

	}
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			customerAdded(customer);   
		}
	}
}
