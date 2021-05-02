package KendiCalismalarim;

public class asalSayilar {

	public static void main(String[] args) {
		
		boolean asalmi=Asalmi(11);
		if (asalmi) 
			System.out.println("Sayý asaldýr");
		else
			System.out.println("Sayý asal deðildir");
	}
	public static boolean Asalmi(int sayi) {
		
		for (int i = 2; i <= sayi/2; i++) {
			if(sayi%i==0) {
				return false;
			}	
		}
		return true;
	}

}
