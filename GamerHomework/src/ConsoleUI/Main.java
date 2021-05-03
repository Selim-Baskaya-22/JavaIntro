package ConsoleUI;


import Adapters.MernisServiceAdapter;
import Business.GamerManager;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer=new Gamer(1, "Selim", "Baþkaya","Selim5757", 2001, "42922915734");
		
		GamerManager checkService=new GamerManager(new MernisServiceAdapter());
		checkService.register(gamer);
		checkService.update(gamer);
		checkService.delete(gamer);
	}

}
