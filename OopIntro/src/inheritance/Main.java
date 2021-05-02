package inheritance;

public class Main {

	public static void main(String[] args) {
	
		IndividualCustomer individualCustomer=new IndividualCustomer();
		
		individualCustomer.setCustomerNumber("1");
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.setCustomerNumber("2");
		
		UnionCustomer unionCustomer=new UnionCustomer();
		
		unionCustomer.setCustomerNumber("3");
		
		CustomerManager customerManager=new CustomerManager();
		
		
		customerManager.customerAdded(individualCustomer);
		customerManager.customerAdded(corporateCustomer);
		customerManager.customerAdded(unionCustomer);
		
		
		Customer[] customer= {individualCustomer,corporateCustomer,unionCustomer};
		customerManager.addMultiple(customer);
	}

}
