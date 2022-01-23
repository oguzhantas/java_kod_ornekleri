
public class Masa extends Metal{

	int genislik;
	int yukseklik;
	
	//Aþaðýdaki metod hata verir.
	//Çünkü süper sýnýfta final olarak tanýmlanmýþtýr.
	//public void simgeYaz() {
	//	System.out.print("Simge yazýlýyor");
	//}
	
	
	public void alanHesapla() {
		System.out.println("Masa alaný:"+genislik*yukseklik);
	}
}
