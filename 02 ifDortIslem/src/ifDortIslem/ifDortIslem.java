package ifDortIslem;
import java.util.Scanner;

public class ifDortIslem {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		double sayi1, sayi2, sonuc=0;
		char islem;
		boolean dortislem=true;
		System.out.print("1.sayýyý giriniz:");
		sayi1 = giris.nextDouble();
		
		System.out.print("2.sayýyý giriniz:");
		sayi2 = giris.nextDouble();
		
		System.out.print("Ýþleminiz(+,*,/,-)");
		islem= giris.next().charAt(0);
		
		if(islem=='+'){
			sonuc=sayi1+sayi2;
		}else if(islem=='-'){
			sonuc=sayi1-sayi2;
		}else if(islem=='*'){
			sonuc=sayi1*sayi2;
		}else if(islem=='/'){
			sonuc=sayi1/sayi2;
		}else{
			System.out.println("dört iþlemden birini giriniz");
			dortislem=false;
		}
		if(dortislem==true)
		System.out.println("Ýþlem sonucu:"+sonuc);
		

	}

}
