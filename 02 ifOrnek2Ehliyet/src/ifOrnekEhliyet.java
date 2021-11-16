import java.util.Scanner;

public class ifOrnekEhliyet {

	public static void main(String[] args) {
		
		int yas;
 		Scanner konsol = new Scanner(System.in);
 
 		System.out.print("Yaþ giriniz:");
 		yas = konsol.nextInt();
 		if(yas>=18)
 			System.out.print("Ehliyet alabilirsiniz");
 		else
 			System.out.print("Yaþýnýz henüz küçük");

	}

}
