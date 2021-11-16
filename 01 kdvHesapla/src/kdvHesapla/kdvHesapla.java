package kdvHesapla;
import java.util.Scanner;
public class kdvHesapla {

	public static void main(String[] args) {
		int fiyat, kdvOran, satisFiyat;
		 Scanner konsol = new Scanner(System.in);
		 System.out.print("Fiyat giriniz");
		 fiyat = konsol.nextInt();
		 
	     System.out.print("KDV Giriniz");
	     kdvOran = konsol.nextInt();
	     
	     satisFiyat = fiyat+ fiyat*kdvOran/100;
	     System.out.print("Satýþ Fiyat:"+satisFiyat);

	}

}
