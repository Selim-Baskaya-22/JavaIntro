package Overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediManagers=new BaseKrediManager[] {new OgretmenKrediManager(),new Tar�mKrediManager(),new OgrenciKrediManager()};
		
		for (BaseKrediManager krediManager : krediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}
		
	}

}
