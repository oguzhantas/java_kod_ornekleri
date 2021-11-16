import java.util.Scanner;
public class sayiDogrusu {

	public static void main(String[] args) {
		Scanner konsol= new Scanner(System.in);
		System.out.println("Sayý giriniz:");
		short sayi=konsol.nextShort();
		
		if(sayi>0)
			System.out.println("Pozitif sayý");
		else if(sayi<0)
			System.out.println("Negatif sayý");
		else
			System.out.println("Girilen sayý Sýfýr");

	}

}
