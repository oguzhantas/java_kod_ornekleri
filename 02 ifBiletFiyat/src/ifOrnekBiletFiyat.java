import java.util.Scanner;
public class ifOrnekBiletFiyat {
	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		System.out.println("1) Öğrenci %40 indirim");
		System.out.println("2) Öğretmen %30 indirim");
		System.out.println("3) Sağlık Çalışanı %30 indirim");
		System.out.println("4) TSK mensubu %30 indirim");
		System.out.println("5) Diğer");

		System.out.println("Seçiminiz(1-5):");
		byte secim = giris.nextByte();
		
		System.out.println("Bilet fiyatı:");
		double fiyat = giris.nextDouble();
		
		
		int indirim=0;
		if(secim==1)
			indirim=40;
		else if(secim==2 || secim==3 || secim==4)
			indirim=30;
		else if(secim==5)
			indirim=0;
		else
			System.out.println("1-5 arası değer giriniz");
		
		double indirimliFiyat = fiyat - fiyat*indirim/100;
		System.out.println("İndirimli Fiyat:"+indirimliFiyat);
		
		
		
		
		
		
	}

}
