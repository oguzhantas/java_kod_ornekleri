package ifOrnekTrafik;
import java.util.Scanner;

public class trafikIsik {

	public static void main(String[] args) {
		char renk;
		Scanner giris = new Scanner(System.in);
		
		System.out.print("Iþýk rengi(K/Y/S):");
		renk= giris.next().charAt(0);
		
		if(renk=='K' || renk=='k')
			System.out.print("DUR");
		else if(renk=='S' || renk=='s')
			System.out.print("BEKLE");
		else if(renk=='Y' || renk=='y')
			System.out.print("GEÇ");
		else
			System.out.println("K/S/Y harflerinden birini giriniz");
	}

}
