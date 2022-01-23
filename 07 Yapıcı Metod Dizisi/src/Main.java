
public class Main {

	public static void main(String[] args) {
		Personel p1= new Personel();
		p1.adi="Oðuzhan";
		p1.soyadi="Taþ";
		p1.dogumYeri="Elazýð";
		p1.yaz();
	
		Personel p2= new Personel("Ali","Can","Van","1234567");
		p2.yaz();
		
		double m[]= {1000,2000,3000};
		Personel p3= new Personel(m);
		p3.adi="Sinan";
		p3.soyadi="Can";
		p3.yaz();

	}
}
