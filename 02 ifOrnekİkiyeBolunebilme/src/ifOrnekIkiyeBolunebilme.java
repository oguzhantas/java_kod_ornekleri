import java.util.Scanner;
public class ifOrnekIkiyeBolunebilme {

	public static void main(String[] args) {
		
		byte sayi;
		Scanner konsol= new Scanner(System.in);
		System.out.println("Sayý giriniz:");
		sayi=konsol.nextByte();
		
		if (sayi%2==0)
			System.out.println("Ýkiye bölünür");
		else
			System.out.println("Ýkiye bölünemez");

	}

}
