
public class Main {

	public static void main(String[] args) {
		

		Kahve k0= new Kahve();
		k0.aile="Etyopya";
		k0.demle();
		
		
		Kahve k1 = new FiltreKahve(); //Upcasting
		k1.aile="Sumatra";
		k1.demle();
		
		Kahve k2 = new Turk_Kahvesi();
		k2.aile="Brezilya";
		k2.demle();

		Turk_Kahvesi k3 = new Turk_Kahvesi();
		k3.cesitTurkKahvesi="";
		k3.demle();
		
	
			Kahve k = new Turk_Kahvesi();
			Turk_Kahvesi tk = (Turk_Kahvesi)k;
		

			Object o = "Merhaba"; //Downcasting
			String s = (String)o;
			System.out.println(s);
		
	}

}
