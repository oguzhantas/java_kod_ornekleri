import java.util.Scanner;
public class ifOrnekSicaklik {
	public static void main(String[] args) {
	
		Scanner giris = new Scanner(System.in);
		System.out.println("Sýcaklýk giriniz:");
		int s= giris.nextInt();
		
		if(s<0)
			System.out.println("Katý halde");
		else if(s>=0 && s<100)
			System.out.println("Sývý halde");
		else if(s>=100)
			System.out.println("Gaz halinde");

	}

}
