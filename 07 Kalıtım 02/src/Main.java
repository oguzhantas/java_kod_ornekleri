
public class Main {

	public static void main(String[] args) {
		Bilgisayar b1 = new Bilgisayar();
		b1.islemci="i7 7700 HQ";
		b1.bellekTipi="SD Ram";
		b1.ekranKarti="ATI";
		b1.fiyat=5000;
		b1.sabitDisk="256 GB";
		b1.ozellikYaz();
		
		System.out.println("====");
		Laptop p1= new Laptop(); //Parametresiz yapýcý metod çaðrýlýyor
		p1.ekranKarti="Nvidia";
		p1.dokunmatikEkran=true; //yeni eklenen
		p1.islemci="i5";
		p1.fiyat=7000;
		p1.bellekTipi="DDR5";
		p1.sabitDisk="512 GB";
		p1.ozellikYaz();
		
		System.out.println("====");
		//parametreli yapýcý metod çaðrýlýyor
		Laptop p2= new Laptop("i7","DDR","512","NVidia",100);
		p2.ozellikYaz();
		
		System.out.println("====");
		Desktop d1 =new Desktop();
		d1.islemci="intel i9";
		d1.ekranKarti="Nvidia 1650TX";
		d1.oyuncuFare=true;
		d1.oyuncuKlavye=true;
		d1.fiyat=25000;
		d1.ozellikYaz();
		
		
	}

}
