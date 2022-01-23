
public class Kitap {

	String kitapAdi;
	double fiyat;
	int sayfaSayisi;
	
	//Yapýcý sýnýf tanýmlýyoruz	
	public Kitap() { 
		sayfaSayisi=250;
		fiyat=25;
	}
	//Parametreli yapýcý metodu
	public Kitap(String kitap_adi, int sayfa_sayisi, double kitap_fiyat) {
		kitapAdi=kitap_adi;
		sayfaSayisi=sayfa_sayisi;
		fiyat = kitap_fiyat;
	}
	
	public void fiyatArtir(double zam) {
		fiyat+=zam;
	}
	
	public void fiyatAzalt(double indirim) {
		fiyat-=indirim;
	}
	
	public void fiyatYuzdeArtir(int oran) {
		fiyat+=fiyat*oran/100;
	}
	
	public void fiyatYuzdeAzalt(int oran) {
		fiyat-=fiyat*oran/100;
	}
	
	public static void main(String[] args) {
		
		Kitap k1=new Kitap();
		k1.kitapAdi="Kaþaðý";
		k1.fiyat=20;
		k1.sayfaSayisi=200;
		
		//k1.fiyatArtir(15);
		//k1.fiyatAzalt(5);
		//k1.fiyatYuzdeArtir(10);
		k1.fiyatYuzdeAzalt(5);
		System.out.println("Kitap adý:"+k1.kitapAdi);
		System.out.println("Fiyatý:"+k1.fiyat);	
		System.out.println("Sayfa Sayýsý:"+k1.sayfaSayisi);
		
		
		
		System.out.println("===");
		Kitap k2 = new Kitap();
		k2.kitapAdi="Þu Çýlgýn Türkler";
		k2.sayfaSayisi=400;
		System.out.println("Kitap adý:"+k2.kitapAdi);
		System.out.println("Fiyatý:"+k2.fiyat);	
		System.out.println("Sayfa Sayýsý:"+k2.sayfaSayisi);
		

	}

}
