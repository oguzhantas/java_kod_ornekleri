import java.util.Scanner;
public class KargoHesaplama {
	public static void main(String[] args) {
		
		double agirlik, ucret=0;
		Scanner konsol = new Scanner(System.in);
		
		System.out.print("Ağırlık giriniz:");
		agirlik=konsol.nextDouble();
		
		if(agirlik>=0.1 && agirlik<1000)
			ucret=10;
		else if(agirlik>=1000 && agirlik<2000)
			ucret=20;
		else if(agirlik>=2000 && agirlik<3000)
			ucret=30;
		else if (agirlik>=3000)
			ucret=40;
		
		System.out.println("Ödenecek:"+ucret);

	}
}
