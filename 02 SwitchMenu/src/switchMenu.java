import java.util.Scanner;
public class switchMenu {
	public static void main(String[] args) {
		
		System.out.println("1) Kayıt");
		System.out.println("2) Arama");
		System.out.println("3) Silme");
		System.out.println("4) Düzeltme");
		System.out.println("5) ÇIKIŞ");
		
		System.out.println("Seçiminiz(1-5):");
		Scanner giris= new Scanner(System.in);
		int secim=giris.nextInt();
		
	switch(secim) {
		case 1:
			System.out.println("Kayıt kısmı başlıyor...");
			break;
		case 2:
			System.out.println("Arama kısmı başlıyor...");
			break;
		case 3:
			System.out.println("Silme kısmı başlıyor...");
			break;
		case 4:
			System.out.println("Düzeltme kısmı başlıyor...");
			break;
		case 5:
			System.out.println("Sistemden çıkılıyor...");
			break;
		default:
			System.out.println("1-5 arası değer giriniz");
			 
			
		} //switch bitim
		
		
		
		
		
	}

}
