
public class Laptop extends Bilgisayar{
	
	//Özellik
	boolean dokunmatikEkran;
	
	public Laptop(){ //Parametresiz yapýcý metod
		dokunmatikEkran=false;
	}
	
	//Parametreli Yapýcý Metod
	public Laptop(String _islemci, 
			String _bellekTipi,
			String _sabitDisk,
			String _ekranKarti, 
			double _fiyat) {
		islemci=_islemci;
		bellekTipi=_bellekTipi;
		sabitDisk=_sabitDisk;
		ekranKarti=_ekranKarti;
		fiyat=_fiyat;
	}
	
	//Metodlar
	public void ozellikYaz() {
		super.ozellikYaz();
		System.out.println("Dokunmatik :"+dokunmatikEkran);
	}
}
