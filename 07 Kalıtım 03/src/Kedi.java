
public class Kedi extends Hayvan{
		
	public Kedi() {
		super();
	}
	
	public void beslen() {
		System.out.println("Kedi besleniyor...");
	}
	
	public void uykuyaDal() {
		super.uyu();
		System.out.println("Kedi uyuyor...");
	}
	
	public void kediOzellikYaz() {
		System.out.println("Ayak sayýsý:"+super.ayakSayisi);
	}
	
	/*public void zipla() {
		
	}*/
	
	
}
