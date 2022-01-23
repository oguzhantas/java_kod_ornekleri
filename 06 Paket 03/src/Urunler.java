import Kayit.*;
import Servis.*;
import BilgiOkuYaz.*;

public class Urunler {

	public static void main(String[] args) {
		Yaz y = new Yaz();
		y.yaz("Ahmet");
		
		KayitIslem urun = new KayitIslem();
		urun.Ekle();
		urun.Duzelt();
		urun.Sil();
		urun.Goster();
		
		ServisIslem islem1= new ServisIslem();
		islem1.veritabaniYedekle();
		islem1.veritabaniGeriYukle();
	}

}
