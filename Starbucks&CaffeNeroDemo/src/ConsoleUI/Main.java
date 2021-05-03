package ConsoleUI;


import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		Customer customer=new Customer(1,"Selim","Baþkaya",new Date(1999),"42922915734");
		BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		
		baseCustomerManager.save(customer);
	}

}
