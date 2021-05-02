package Overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	@Override
	public double hesapla(double tutar) {
		// TODO Auto-generated method stub
		return tutar*1.10;
	}
}
