package AbstractDemo;

public class CustomerManager {
	
	private BaseDataManager baseDataManager;
	public CustomerManager(BaseDataManager baseDataManager) {
		this.baseDataManager = baseDataManager;
	}
	public void getCustomer() {
		System.out.println("Müşteriler Getirildi!");
		baseDataManager.getData();
	}
}
