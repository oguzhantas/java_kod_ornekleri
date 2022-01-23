
public class Hayvan {

	//Aþaðýdaki özellik tüm türetilen sýnýflarda kullanýlabilir.
	public static int ayakSayisi=4;

	public Hayvan() {
		System.out.println("Hayvan yapýcý metodu çaðrýldý");
	}
	
	public void beslen() {
		System.out.println("Besleniyor..");
	}
	
	public void uyu() {
		System.out.println("Uyuyor...");
	}
	
	final void zipla() {
		System.out.println("Zýplýyor...");
	}
	
}
