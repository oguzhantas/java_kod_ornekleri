
public class metodlar3 {

	public static double satisFiyatBul(double fiyat, int kdv) {
		if(kdv<=100 && fiyat!=0)
		{
			double sonuc=fiyat+fiyat*kdv/100;
			return(sonuc);
		} else return(-1);
		
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
	
		double f=100;
		int k=18;
		double s= satisFiyatBul(f, k);
		System.out.println("Satýþ Fiyatý:"+s);
		/* Satýþ fiyatýndan Fiyat Bulma ***/
		s=236; //satiþ fiyat 
		k=18; //kdv oraný %
		f=FiyatBul(s, k);
		System.out.println("Fiyat ="+f);
		
		double satis=354;
		double fiyat=300;
		double kdv=kdvBul(satis, fiyat);
		System.out.println("KDV(%) ="+kdv);
		
	}

}
