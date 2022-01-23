import java.util.Scanner;
public class sonsuzDongu {
	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		char girilen='A';
		for(;girilen!='X';) {
			System.out.println("A) Kayýt Giriþ");
			System.out.println("B) Kayýt Arama");
			System.out.println("C) Kayýt Düzeltme");
			System.out.println("D) Kayýt Silme");
			System.out.print("Seçiminiz:");
			girilen= giris.next().trim().charAt(0);
			 
			switch(girilen) {
			case 'A':
				System.out.println("Giriþ seçildi");
				break;
			case 'B':
				System.out.println("Arama seçildi");
				break;
			case 'C':
				System.out.println("Düzeltme seçildi");
				break;
			case 'D':
				System.out.println("Silme seçildi");
				break;
			default:
				System.out.println("Lütfen A,B,C,D giriniz");
			}
			
			
		}

	}

}
