package Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;
import java.util.Calendar;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		       boolean result=false;
	
			
			
				KPSPublicSoap client = new KPSPublicSoapProxy();
				
					try {
						result =client.TCKimlikNoDogrula(
								Long.parseLong(customer.getNationalityId()),
								customer.getFirstName().toUpperCase(),
								customer.getLastName().toUpperCase(),
								customer.getDateOfBirth());
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (result) {
						System.out.println("doðru");
					}
					else
						System.out.println("yanlýþ");
					return result;
			
			

	}

}
