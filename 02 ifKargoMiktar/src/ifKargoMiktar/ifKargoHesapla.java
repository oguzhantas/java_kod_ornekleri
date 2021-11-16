package ifKargoMiktar;
import java.util.Scanner;

public class ifKargoHesapla {

	public static void main(String[] args) {
			
		double agirlik,tutar=0;
		Scanner giris=new Scanner(System.in);
		
		System.out.print("Kargo ağırlığı giriniz:");
		agirlik=giris.nextDouble();
		
		if (agirlik>0.1 && agirlik<1000)
			tutar=10;
		else if(agirlik>=1000 && agirlik<2000)
			tutar=20;
		else if(agirlik>=2000 && agirlik<3000)
			tutar=30;
		else if(agirlik>=3000)
			tutar=40;
		
		System.out.print("Ödenecek tutar:"+tutar);
		
	}

}
