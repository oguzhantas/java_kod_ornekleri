
public class Arac {

	//Özellikler
	String marka;
	int modelYili;
	String renk;
	int kiloMetre;
	String yakitTipi;
	double fiyat;
	
	public Arac() { //Yapýcý metod
		this.marka="Audi";
		this.modelYili=2022;
		System.out.println("Araç sýnýfý yapýcý metodu çaðrýldý");
	}
	
	public Arac(String _marka, 
			int _modelYili,
			String _renk,
			int _kiloMetre,
			String _yakitTipi,
			double _fiyat) { //Yapýcý metod

		this.marka = _marka;
		this.modelYili= _modelYili;
		this.renk = _renk;
		this.kiloMetre= _kiloMetre;
		this.yakitTipi = _yakitTipi;
		this.fiyat = _fiyat;
		
		
	}
	//Metodlar
	public void ozellikYaz() {
		System.out.println(marka);
		System.out.println(modelYili);
		System.out.println(renk);
		System.out.println(kiloMetre);
		System.out.println(yakitTipi);
		System.out.println(fiyat);
		
	} //ozellikYaz
}

