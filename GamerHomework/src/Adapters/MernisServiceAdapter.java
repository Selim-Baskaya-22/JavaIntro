package Adapters;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		boolean result=false;
		
		KPSPublicSoap client=new KPSPublicSoapProxy();
		
		try {
			result=client.TCKimlikNoDogrula(
					Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName(), 
					gamer.getLastName(), 
					gamer.getDateOfBirth());
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(result) {
			System.out.println("Kimlik doðrulama baþarýlý");
		}else {
			System.out.println("Kimlik doðrulama baþarýsýz.");
		}
		return result;
	}

}
