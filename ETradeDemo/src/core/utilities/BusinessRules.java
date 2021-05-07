package core.utilities;

public class BusinessRules {
	/*Business Rules Yapisi
	 1)�ncelikle static bir method kulland�m bu benim hem newleme gibi pahali bir islemden kurtulmami sa�ladi hemde 
	 �rn(BusinessRules.MethodIsmi) seklinde daha okunabilir ve kullanisli bir yapiya cevirdi.
	 
	 2)boolean... dememizin nedeni burada sana boolean arrayi g�ndericem sen onlar�n hepsini alicaksin demek. Yani ben
	 boolean tipindeki b�t�n methodlar�m� sadece virg�l koyarak yan yana yazabilece�im anlamina geliyor.
	 
	 3)for i�ini derste bir�ok �rnekle anladik. Burada benim bir boolean tipinde ARRAYiM oldu�u i�in burada foreach d�ng�s� ile
	 hepsini tek tek gez komutu veriyorum.
	 
	 4)If i�indeki kontrol yapisi ise eger herhangi bir methodum !logic se yani false ise return false d�nd�r. Zaten benim 
	 methodlarim boolean oldugu icin ya false ya true d�n�cektir. Bu return false biliyorsunuz ki bir forda ifte foreachta 
	 herhangi bir yerde return yaparsam direk o de�eri d�nd�r�cek di�er de�erler icin return yap�lmayacaktir.
	 
	 Insallah anlatabilmisimdir. Bircok odev yapan arkadaslarda g�rd�m bu yapiyi bir aciklama yapmam gerekti�ini d�s�nd�m.
	 Eger anlasilmayan bir konu var ise discorddan Selim#5713 eklerseniz yardimci olabilirim. Iyi calismalar
	 */
	public static boolean Run(boolean... logics) {
		for (boolean logic : logics) {
			if (!logic) {
				return false;
			}
		}
		return true;
	}


}
