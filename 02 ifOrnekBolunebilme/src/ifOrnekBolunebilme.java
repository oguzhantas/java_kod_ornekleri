import java.util.Scanner;
public class ifOrnekBolunebilme {

	public static void main(String[] args) {
		Scanner konsol= new Scanner(System.in);
		System.out.println("Sayý giriniz:");
		byte sayi=konsol.nextByte();
		
	if (sayi%2==0 && sayi%3==0)
		System.out.println("Sayý 2'ye ve 3'e bölünür");
	else if(sayi%2==0 || sayi%3==0){ 
			if (sayi%2==0)
			System.out.println("Sayý 2'ye bölünür");
			else if(sayi%3==0)
			System.out.println("Sayý 3'e bölünür");
	} else{
		System.out.println("Sayý 2 ve 3'e bölünemez");
	}	
 }
}
