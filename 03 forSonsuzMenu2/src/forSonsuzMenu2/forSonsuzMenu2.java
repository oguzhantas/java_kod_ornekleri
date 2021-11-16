package forSonsuzMenu2;

import java.util.Scanner;

public class forSonsuzMenu2 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		char bilgi='A';
		
		for(;bilgi!='X';) {
			System.out.println("A) Kayýt Giriþ");
			System.out.println("B) Kayýt Arama");
			System.out.println("C) Kayýt Düzeltme");
			System.out.println("D) Kayýt Silme");
			System.out.println("X) Çýkýþ");
			System.out.print("Seçiminiz:");
			bilgi=giris.next().charAt(0);
			
			switch(bilgi) {
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
			case 'X':
				System.out.println("Çýkýldý");
	 			break;
			default:
				System.out.println("A,B,C,D,X harflerinden birini giriniz:");
			} //switch
			
			//if (bilgi=='X') break;
		} //for bitiþ
			
			System.out.println("Programdan çýkýldý");

	}

}
