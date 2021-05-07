package core.utilities;

public class BusinessRules {
	/*Business Rules Yapisi
	 1)öncelikle static bir method kullandým bu benim hem newleme gibi pahali bir islemden kurtulmami saðladi hemde 
	 örn(BusinessRules.MethodIsmi) seklinde daha okunabilir ve kullanisli bir yapiya cevirdi.
	 
	 2)boolean... dememizin nedeni burada sana boolean arrayi göndericem sen onlarýn hepsini alicaksin demek. Yani ben
	 boolean tipindeki bütün methodlarýmý sadece virgül koyarak yan yana yazabileceðim anlamina geliyor.
	 
	 3)for içini derste birçok örnekle anladik. Burada benim bir boolean tipinde ARRAYiM olduðu için burada foreach döngüsü ile
	 hepsini tek tek gez komutu veriyorum.
	 
	 4)If içindeki kontrol yapisi ise eger herhangi bir methodum !logic se yani false ise return false döndür. Zaten benim 
	 methodlarim boolean oldugu icin ya false ya true dönücektir. Bu return false biliyorsunuz ki bir forda ifte foreachta 
	 herhangi bir yerde return yaparsam direk o deðeri döndürücek diðer deðerler icin return yapýlmayacaktir.
	 
	 Insallah anlatabilmisimdir. Bircok odev yapan arkadaslarda gördüm bu yapiyi bir aciklama yapmam gerektiðini düsündüm.
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
