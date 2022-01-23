
public class Personel {

	String adi;
	String soyadi;
	String TC;
	String dogumYeri;
	
	public Personel() {
		dogumYeri="Ýstanbul";
	}
	
	public Personel(String _adi, 
					String _soyadi, 
					String _TC, 
					String _dogumYeri)
	{
		this.adi=_adi;
		this.soyadi=_soyadi;
		this.TC = _TC;
		this.dogumYeri=_dogumYeri;
	}
	
	public Personel(double[] maaslar){ //Yapýcý metodlara void yazýlmaz
		double toplam=0;
		for(int i=0;i<maaslar.length; i++)
		{
			System.out.println((i+1)+".Maaþ ="+maaslar[i]);
			toplam+=maaslar[i];
		}
		System.out.println("Toplam maaþ:"+toplam);
	}
	
	public void yaz() {
		System.out.println("Adý:"+this.adi);
		System.out.println("Soyadý:"+this.soyadi);
		System.out.println("TC:"+this.TC);
		System.out.println("Doðum yeri:"+this.dogumYeri);
		
	}
}
