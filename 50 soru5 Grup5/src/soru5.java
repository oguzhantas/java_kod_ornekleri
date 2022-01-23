/*
 Aþaðýdaki dizide en büyük elemaný bulup, 
 tüm elemanlarý enbüyük elemandan farklarýnýn 
 faktöriyelini yeni bir diziye yazdýrýnýz. 
 Örneðin aþaðýdaki dizide en büyük deðer 12’dir. 
 Yeni dizinin elemanlarý {2!,4!,5!,0!} olacaktýr, 
 sonuç dizisi {2,24,120,1} olacaktýr. 
 Faktöriyel ve en büyük bulma iþlemleri 
 metod ile yapýlacaktýr (20 Puan)
int dizi[]= {10,8,7,12};

 * */
public class soru5 {
	
	public static int enBuyukBul(int a[]) {
		int enbuyuk=a[0];
		int elemanSayisi=a.length;
		for(int i=0;i<elemanSayisi;i++) {
			if(a[i]>enbuyuk)
				enbuyuk=a[i];
		}
		return(enbuyuk);
	}
	
	public static int faktoriyel(int n) {
		if(n==0 || n==1)
			return 1;
		else {
			int fakt=1;
			for(int i=1;i<=n;i++)
				fakt*=i;
			return(fakt);
		}
	}
	
	public static void main(String[] args) {
		int dizi[]= {10,8,7,12};
		//System.out.println(enBuyukBul(dizi));
		int enbuyuk=enBuyukBul(dizi);
		//System.out.println(faktoriyel(5));
		for(int i=0;i<dizi.length;i++)
		{
			dizi[i]=enbuyuk-dizi[i];
			System.out.print(dizi[i]);
			dizi[i]=faktoriyel(dizi[i]);
			System.out.println(" Faktöriyeli:"+dizi[i]);
		}
		

	}

}
