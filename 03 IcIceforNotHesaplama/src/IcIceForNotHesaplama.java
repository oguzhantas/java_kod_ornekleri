import java.util.Scanner;
public class IcIceForNotHesaplama {
	public static void main(String[] args) {
		
		Scanner giris= new Scanner(System.in);
		double ortalama=0, toplam=0, dnot=0;
		double ortalamaToplam=0, sinifOrtalama=0;
		//bu döngü öðrenci sayýsý kadar dönecek	
		for(int i=1;i<=2;i++) {
			//bu döngü ders sayýsý kadar dönecek
			for(int j=1;j<=3;j++) {
				System.out.print(i+".öðrenci,"+j+".ders Notu:");
				dnot=giris.nextDouble();
				toplam+=dnot;
			} //for j
			ortalama= toplam/3; //ders sayýsýna bölüyoruz
			ortalamaToplam+=ortalama;
			System.out.println(i+".öðrenci ortalamasý:"+ortalama);
			
			ortalama=0;
			toplam=0;
		}//for i
		sinifOrtalama=ortalamaToplam/2; //öðrenci sayýsýna 
		System.out.println("Sýnýf ortalamasý:"+sinifOrtalama);
		
	}

}
