import java.util.Scanner;
public class DiziOrtalamaBul {

	public static void main(String[] args) {
		Scanner giris= new Scanner(System.in);
		
		double[] notlar= new double[5];
		double toplam=0, ortalama=0;
		
		for(int i=0;i<notlar.length;i++) {
			
			System.out.print((i+1)+". notu giriniz:");
			notlar[i]= giris.nextDouble();
			toplam+=notlar[i];
		}
		ortalama= toplam/notlar.length;
		System.out.println("Ortalama:"+ortalama);
	}
}
