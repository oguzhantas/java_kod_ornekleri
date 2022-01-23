import java.util.Scanner;
public class forSonsuzDortIslem {
	public static void main(String[] args) {
		
		Scanner giris= new Scanner(System.in);
		char girilen='+';
		int sayi1=0, sayi2=0, sonuc=0;
		for(;;) {

			System.out.println("+)Toplama");
			System.out.println("-)Çýkarma");
			System.out.println("*)Çarpma");
			System.out.println("/)Bölme");
			System.out.println("X)Çýkýþ");
			
			System.out.print("Seçiminiz:");
			girilen=giris.next().charAt(0);	
			
			if (girilen!='X') {
				System.out.print("1. sayý:");
				sayi1=giris.nextInt();
			
				System.out.print("2. sayý:");
				sayi2=giris.nextInt();
			} 
			if(girilen=='+')
				sonuc=sayi1+sayi2;
			else if(girilen=='-')
				sonuc=sayi1-sayi2;
			else if(girilen=='*')
				sonuc=sayi1*sayi2;
			else if(girilen=='/') {
				if(sayi2!=0)
					sonuc=sayi1/sayi2;
				else
					System.out.println("Sýfýra bölünemez");
			} else if(girilen=='X')
				break;
			
			System.out.println("Sonuç:"+sonuc);
		} //for
		System.out.println("Program sonlandý");
	} //main
}//class
