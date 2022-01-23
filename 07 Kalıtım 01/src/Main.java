
public class Main {

	public static void main(String[] args) {
		Arac a1 = new Arac();
		a1.marka="Mercedes";
		a1.modelYili=2021;
		a1.kiloMetre=300;
		a1.renk="Kýrmýzý";
		a1.yakitTipi="Benzin";
		a1.fiyat=250;
		a1.ozellikYaz();
		
		System.out.println("======");
		Arac a2 = new Arac();
		a2.fiyat=300000;
		a2.renk="Mavi";
		a2.kiloMetre=100000;
		a2.yakitTipi="Dizel";
		a2.ozellikYaz();
		
		System.out.println("======");
		Kamyon k1 = new Kamyon();
		k1.marka="Mercedes"; //kalýtýmla geldi
		k1.modelYili=2020;//kalýtýmla geldi
		k1.renk="Turuncu";
		k1.kiloMetre=200;
		k1.yakitTipi="Dizel";
		k1.yukKapasitesi=2000; //bu özellik yeni
		k1.fiyat=450;
		k1.ozellikYaz();
		System.out.println("======");
		
		Otomobil o1 =new Otomobil();
		o1.marka="Mercedes A150";
		o1.modelYili=2020;
		o1.renk="Yeþil";
		o1.kiloMetre=500;
		o1.yakitTipi="Elektrik";
		o1.fiyat=550;
		o1.yolcuSayisi=5; //bu özellik yeni
		o1.ozellikYaz();
		
		System.out.println("======");
		Otomobil o2= new Otomobil();
		o2.ozellikYaz();
		
	}

}
