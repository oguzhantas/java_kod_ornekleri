import java.util.Scanner;

public class ifOrnekKahve {

	public static void main(String[] args) {
		double fiyat=0, toplam=0;
		byte secim, adet=1;
		System.out.println("Kahve Seçiniz:");
		System.out.println("1)Latte-10TL");
		System.out.println("2)Americano-8TL");
		System.out.println("3)Macchiato-12TL");
		System.out.println("4)Filtre-9TL");
		
		Scanner konsol= new Scanner(System.in);
		System.out.println("Seçiminiz:");
		secim=konsol.nextByte();
		System.out.println("Kaç Adet:");
		adet=konsol.nextByte();
		
		if(secim==1)
			fiyat=10;
		else if(secim==2)
			fiyat=8;
		else if(secim==3)
			fiyat=12;
		else if(secim==4)
			fiyat=9;
		toplam =adet*fiyat;
		System.out.println("Ödenecek:"+toplam);
	}
}
