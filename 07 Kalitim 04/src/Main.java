
public class Main {

	public static void main(String[] args) {
		
		Hayvanlar h1 = new Hayvanlar();
		h1.aileAdi="Ýngiliz";
		h1.ayakSayisi=4;
		h1.sesCikar();
		h1.beslen();
		h1.uyu();
		System.out.println("====");
		Kedi k1 = new Kedi();
		k1.aileAdi="Van XYZ";
		k1.ayakSayisi=4;
		k1.kediTur="Van";
		k1.sesCikar(); //üst metod Ezilecek 
		k1.beslen();
		k1.uyu();
		System.out.println("====");
		Kopek d1 = new Kopek();
		d1.aileAdi="Kangal";
		d1.ayakSayisi=4;
		d1.avlan();
		d1.beslen();
		d1.sesCikar(); //üst metod ezilecek
		d1.uyu();
	}

}
