import java.util.Scanner;


public class boyKitleIndeksi {

	public static void main(String[] args) {
		double boy, kilo, BKI;
		 Scanner konsol = new Scanner(System.in);
		 
		 System.out.print("Kilo giriniz:");
		 kilo = konsol.nextDouble();
	     
		 System.out.print("Boy Giriniz:");
	     boy = konsol.nextDouble();
	     
	     BKI = kilo/(boy*boy);
	     System.out.print("Boy Kitle Indeksi:"+BKI);

	}

}
