package KendiCalismalarim;

public class mukemmelSayi {

	public static void main(String[] args) {
		mukemmelmi(28);
	}
	public static void mukemmelmi(int sayi) {
		int yenideger=0;
		for (int i = 1; i <= sayi/2; i++) {
			if (sayi%i==0) {
				yenideger+=i;
			}
		}
		if (yenideger==sayi) {
			System.out.println("M�kkemel say�d�r");
		}
		else {
			System.out.println("M�kemmel say� de�ildir");
		}
		
	}

}
