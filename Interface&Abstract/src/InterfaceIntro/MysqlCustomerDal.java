package InterfaceIntro;

public class MysqlCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Müşteriler Eklendi: mysql");		
	}

}
