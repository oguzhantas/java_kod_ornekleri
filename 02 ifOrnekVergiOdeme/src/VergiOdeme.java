import java.util.Scanner;
public class VergiOdeme {
	public static void main(String[] args) {
		double maas, vergi=0;
		Scanner giris = new Scanner(System.in);
		
		System.out.print("Maaþ giriniz:");
		maas = giris.nextDouble();
		
		if(maas<5000)
			vergi=100;
		else if(maas>=5000 && maas<6000)
			vergi=150;
		else if(maas>=6000 && maas<7000)
			vergi=200;
		else if(maas>=7000)
			vergi=250;
		
		System.out.print("Vergi:"+vergi);
	}
}
