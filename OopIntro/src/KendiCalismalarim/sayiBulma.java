package KendiCalismalarim;

public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = { 1, 2, 5, 7, 9, 0 };
		int aranacak = 3;
		boolean durum=false;
		for (int sayi : sayilar) {
			if (aranacak == sayi) {
				durum=true;
			} 
		}
		if (durum) {
			System.out.println("Sayý listede var");
		}
		else 
			System.out.println("sayý listede yok");
	}
}
