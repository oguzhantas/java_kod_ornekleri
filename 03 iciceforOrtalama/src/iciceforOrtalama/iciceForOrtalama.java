package iciceforOrtalama;
import java.util.Scanner;
public class iciceForOrtalama {
	public static void main(String[] args) {
		
	Scanner giris= new Scanner(System.in);	
	int ogrenciSayisi=2;
	int dersSayisi=3;
	double dnot=0, toplam=0, ortalama=0;
	
	for(int i=1;i<=ogrenciSayisi;i++) {
		for(int j=1;j<=dersSayisi;j++)
		{
			System.out.print(i+".öðrenci "+j+".ders notu:");
			dnot=giris.nextDouble();
			toplam+=dnot;
		} //ders sayýsý
		
		ortalama= toplam/dersSayisi;
		System.out.println(i+". öðrenci ortalamasý:"+ortalama);
		toplam=0; ortalama=0;
		
	} //for öðrenci Sayýsý
	

	}

}
