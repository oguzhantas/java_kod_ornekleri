
public class Main {

	public static void main(String[] args) {
		System.out.println("Hayvan sýnýfýndan nesne oluþturuluyor");
		
		Hayvan h1= new Hayvan();
		h1.beslen();
		h1.uyu();
		
		System.out.println("Kedi sýnýfýndan nesne oluþturuluyor");
		Kedi tekir = new Kedi();
		tekir.beslen();
		tekir.uykuyaDal();
		tekir.kediOzellikYaz();
		
		/*System.out.println("Çita sýnýfýndan nesne oluþturuluyor");
		Cita c1= new Cita();
		c1.beslen();
		*/

	}

}
