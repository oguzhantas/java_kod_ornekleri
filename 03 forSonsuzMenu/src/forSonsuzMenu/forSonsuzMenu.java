package forSonsuzMenu;

import java.util.Scanner;
public class forSonsuzMenu {

	public static void main(String[] args) {

		Scanner giris= new Scanner(System.in);
		char girilen='A';
		
		for(;girilen!='X';) {
			System.out.println("A) Kayýt Giriþ");
			System.out.println("B) Kayýt Düzeltme");
			System.out.println("C) Kayýt Silme");
			System.out.println("D) Kayýt Arama");
			System.out.print("Seçiminiz(Çýkmak için X):");
			girilen= giris.next().charAt(0);
			
			switch(girilen) {
			case 'A':
				System.out.println("Giriþ seçildi");
				break;
			case 'B':
				System.out.println("Düzeltme seçildi");
				break;
			case 'C':
				System.out.println("Silme seçildi");
				break;
			case 'D':
				System.out.println("Arama seçildi");
				break;
			
			
			}
		} //for bitiþ
		System.out.println("Programdan Çýkýldý");
	
		

	}

}
