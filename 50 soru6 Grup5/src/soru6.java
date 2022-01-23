/*gectiKaldi þeklinde bir metod yazýnýz, 
 * gönderilen sayý(n) 50’den büyük eþitse true, 
 * 50’den küçük ise false döndürsün.
a)	puanHesapla isimli diðer bir metod ile 
gectiKaldi metodundan true döndürüyorsa 
aþaðýdaki kurallara göre puan hesaplayýnýz.
50<not<54 ise 2;
55<not<69 ise 3;
70<not<84 ise 4;
85<not<100 ise 5 döndürünüz. 
b)	mesajVer isimli diðer bir metod ile gectiKaldi metodundan false dönüyorsa ekrana
“Daha çok çalýþmalýsýn” mesajý yazdýrýnýz. 
*/

import java.util.Scanner;

public class soru6 {
	
	public static boolean gectiKaldi(double n) {
			if(n>=50) return true;
			else return false;
	}
	
	public static void mesajVer() {
		System.out.print("Daha çok çalýþmalýsýn");
	}
	
	public static int puanHesapla(double puan) {
		int sonuc=0;
		if(gectiKaldi(puan))
		{
			if(puan>=50 && puan<=54)
				sonuc=2;
			else if(puan>=55 && puan<=69)
				sonuc=3;
			else if(puan>=70 && puan<=84)
				sonuc=4;
			else if(puan>=85 && puan<=100)
				sonuc=5;
		}else mesajVer();
		return(sonuc);
		
	}
	
	public static void main(String[] args) {
		Scanner giris= new Scanner(System.in);
		System.out.print("Puaný giriniz:");
		int p= giris.nextInt();
		System.out.print("Notunuz:"+puanHesapla(p));

	}

}
