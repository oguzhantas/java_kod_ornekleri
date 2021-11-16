package forSonsuzIslem;

import java.util.Scanner;
public class forSonsuzIslem {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		char secim;
		int s1=0, s2=0;
		double sonuc=0;
		for(;;) {
					
			System.out.println("+) Toplama");
			System.out.println("-) Çýkarma");
			System.out.println("/) Bölme");
			System.out.println("*) Çarpma");
			System.out.println("X) Çýkýþ");
			System.out.print("Seçiminiz:");
			secim= giris.next().charAt(0);
			
			if (!(secim=='X' || secim=='x')) {
				System.out.print("1. sayý:");
				s1= giris.nextInt();
				
				System.out.print("2. sayý:");
				s2= giris.nextInt();
			}
			

			if(secim=='X' || secim=='x') 
				break;
			else if(secim=='+')
				sonuc=s1+s2;
			else if(secim=='*')
				sonuc=s1*s2;
			else if(secim=='-')
				sonuc=s1-s2;
			else if(secim=='/') {
				if(s2==0)
					System.out.println("Sýfýra bölünemez");
				else
					sonuc=(double)s1/s2;
			}
			else{
					System.out.println("+,-,*,/ iþaretlerinden birini giriniz");
					break;
				}
			
			System.out.println("Sonuç:"+sonuc);
			
		}//for
		System.out.print("Programdan çýkýldý");
		

	}

}
