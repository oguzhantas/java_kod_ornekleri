import java.util.Scanner;
public class AskerlikDurum {
	public static void main(String[] args) {
		char cinsiyet;
		int dogumTarihi;
		int yas;
		
		Scanner konsol = new Scanner(System.in);
		System.out.print("Cinsiyetiniz:");
		cinsiyet = konsol.next().charAt(0);
		
		if(cinsiyet=='E' || cinsiyet=='e'){
			System.out.print("Doðum tarihiniz:");
			dogumTarihi=konsol.nextInt();
			yas=2021-dogumTarihi;
			
			if(yas>=18)
				System.out.print("Askere gidebilirsiniz");
			else
				System.out.print("Yaþýnýz küçük");
			
		}else{
			System.out.print("Kýzlara henüz askerlik yok");
		}			
	}
}
