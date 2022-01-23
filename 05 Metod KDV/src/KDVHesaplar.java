
public class KDVHesaplar {

	public static double satisFiyatBul(double fiyat, int kdv) {
		double sonuc=fiyat+fiyat*kdv/100;
		return(sonuc);
	}

	public static double FiyatBul(double satis, int kdv) {
		double fiyat =satis/(1+kdv/100.0);
		return(fiyat);
	}

	public static double kdvBul(double satis, double fiyat) {
		double kdv=100*((satis/fiyat)-1);
		return(Math.round(kdv));
	}

	
	public static void main(String[] args) {
		
		double s=236, f=200, k;
		k=kdvBul(s,f);
		System.out.print("KDV:"+k);
	}

}
