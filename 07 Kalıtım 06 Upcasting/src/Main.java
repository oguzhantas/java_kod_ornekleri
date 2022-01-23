
public class Main {

	public static void raporVer(Arac arc) {
		arc.bilgi();
	}
	
	public static void main(String[] args) {
		Arac a1= new Arac();
		Otomobil b1= new Otomobil();
		Kamyon c1 = new Kamyon();
		//raporVer(a1);
		//raporVer(b1); //Upcasting 
		raporVer(c1); //Upcasting
	}

}
