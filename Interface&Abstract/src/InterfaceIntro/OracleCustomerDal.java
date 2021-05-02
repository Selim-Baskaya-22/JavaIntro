package InterfaceIntro;

public class OracleCustomerDal implements ICustomerDal{
	@Override
	public void add() {
		System.out.println("Müþteriler Eklendi: Oracle");		
	}

}
