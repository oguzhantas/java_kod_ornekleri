interface Ogretmen{
	public void dersVer();
}

interface Ogrenci{
	public void dersDinle();
}

interface Okul extends Ogretmen, Ogrenci{
	public void dersBaslasin();
}

public class Test {
	public static void main(String[] args) {
	Okul okul= new Okul() {
		public void dersDinle() {
			System.out.println("Ders dinleniyor..");
		};
		public void dersVer() {
			System.out.println("Ders veriliyor..");
		};
		
		public void dersBaslasin() {
			System.out.println("Ders baþlatýldý..");
		};
	}; //okul
		okul.dersVer();
		okul.dersDinle();
		okul.dersBaslasin();
	} //main
}//Test class
