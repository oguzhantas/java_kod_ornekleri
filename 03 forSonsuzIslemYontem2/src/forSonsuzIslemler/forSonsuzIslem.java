package forSonsuzIslemler;
import java.util.Scanner;
public class forSonsuzIslem {
	public static void main(String[] args) {
		
		char bilgi='+';
		int s1=0, s2=0;
		double sonuc=0;
		Scanner giris= new Scanner(System.in);
	
	for(; !(bilgi=='X' || bilgi=='x');) { //X seçilmediði sürece dön
		
		System.out.println("+) Toplama");
		System.out.println("-) Çýkarma");
		System.out.println("*) Çarpma");
		System.out.println("/) Bölme");
		System.out.println("X) Çýkýþ");
		System.out.println("");
		
		System.out.print("Seçiminiz:");
		bilgi= giris.next().charAt(0);
		
		if(!(bilgi=='X'|| bilgi=='x')) {
			System.out.print("1. sayý:");
			s1= giris.nextInt();
			
			System.out.print("2. sayý:");
			s2= giris.nextInt();
		} //if
		
		
		if(bilgi=='+')
			{sonuc=s1+s2;}
		else if(bilgi=='-')
			{sonuc=s1-s2;}
		else if(bilgi=='*')
			{sonuc=s1*s2;}
		else if(bilgi=='/') {
			if(s2==0)
				System.out.println("Sýfýra bölme hatasý");
			else 
				sonuc=(double)s1/s2;
		}else if(bilgi=='X' || bilgi=='x') {
			System.out.println("Çýkýþ seçildi");
		}
		
		else {
			System.out.println("Dört iþlem sembolü giriniz");
		}
		
		if(bilgi!='X')
			System.out.println("Sonuç:"+sonuc);
	} //for bitiþ
		

	} //main

} //class
