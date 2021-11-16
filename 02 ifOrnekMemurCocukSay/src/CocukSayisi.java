import java.util.Scanner;

public class CocukSayisi {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int cocukSay;
		double ucret=0;
		System.out.print("Cocuk sayisini giriniz:");
		cocukSay= giris.nextInt();
		
		if(cocukSay==1)
		{
			//Çocuk sayısı 1 ise
			//6 dan büyük mü, küçük mü ona bakacağız.
			System.out.print("Yaşını giriniz:");
			int yas=giris.nextInt();
			if(yas>=6)
				ucret=40;	
			else 
				ucret=60;
			
		}else if(cocukSay>=2){
			 
			//ilk çocuğun yaşı sorulacak
			// eğer ilk çocuk 6'dan büyükse 40 TL
			// değilse 6'dan küçükse  60 TL
			System.out.print("1.çocuk yaşını giriniz:");
			int yas1=giris.nextInt();
			if(yas1>=6)
				ucret=40;	
			else 
				ucret=60;

			//İkinci çocuğun yaşı sorulacak
			// Eğer ikinci çocuk 6'dan büyükse 40 TL
			// küçükse 60 TL
			System.out.print("2.çocuk yaşını giriniz:");
			int yas2=giris.nextInt();
			if(yas2>=6)
				ucret+=40;	
			else 
				ucret+=60;
			
			}//cocuksay>=2
		
		
	System.out.print("Alacağınız ücret:"+ucret);

	}
}
