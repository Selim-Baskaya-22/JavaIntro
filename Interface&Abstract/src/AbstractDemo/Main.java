package AbstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager(new MySqlDatabaseManager());
		customerManager.getCustomer();
	}

}
