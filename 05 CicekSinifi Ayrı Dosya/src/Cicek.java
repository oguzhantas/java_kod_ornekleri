public class Cicek {
	//Özellikler
	String renk;
	double fiyat;
	
	public void fiyatArtir(double miktar) {
		fiyat+=miktar;
	}
	
	public void fiyatAzalt(double miktar) {
		fiyat-=miktar;
	}
	
	public double yuzdeArtir(int oran) {		
		double yeniFiyat=fiyat+fiyat*oran/100;
		return(yeniFiyat);
		
	}

}
