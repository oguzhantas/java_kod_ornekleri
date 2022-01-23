
public class Cicek {
	
	String cicekAdi; //Çiçek sýnýfýnýn özelliði
	double fiyat;
	
	public void isminiYaz() {
		System.out.println(cicekAdi);
	}
	
	public void fiyatYaz() {
		System.out.println("Fiyatý:"+fiyat);
	}
	
	public static void main(String[] args) {
		Cicek gul=new Cicek();
		gul.cicekAdi="Kýrmýzý Gül";
		gul.fiyat=20;
		gul.isminiYaz();
		gul.fiyatYaz();
		
		Cicek papatya=new Cicek();
		papatya.cicekAdi="Sarý papatya";
		papatya.fiyat=15;
		papatya.isminiYaz();
		papatya.fiyatYaz();
	}
}
