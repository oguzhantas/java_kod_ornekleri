
public class Bilgisayar {

	//Özellikler
	String islemci;
	String bellekTipi;
	String sabitDisk;
	String ekranKarti;
	double fiyat;
	
	//Metodlar
	//Parametresiz Yapýcý Metod
	public Bilgisayar() { 
		this.islemci="Intel i9";
		this.bellekTipi="32 GB DDR";
		this.sabitDisk="2048 GB HDD";
		this.ekranKarti="Nvidia 1050TX";
		this.fiyat=15000;
	
	}

	
	public void ozellikYaz() {
		System.out.println("Ýþlemci:"+islemci);
		System.out.println("Bellek:"+bellekTipi);
		System.out.println("Ekran Kartý:"+ekranKarti);
		System.out.println("Sabit Disk:"+sabitDisk);
		System.out.println("Fiyat:"+fiyat);
		
	}
	
}
