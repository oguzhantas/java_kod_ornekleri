
public class AnaSinif {

	static void benimStatikMetod()
	{
		System.out.println("Statik sýnýflarý kullanmak için nesne oluþturulmaz");
	}
	
	public void benimPublicMetod() {
		System.out.print("Bu metod public");
		System.out.println("nesne oluþturulmadan kullanýlmaz");
	}
	public static void main(String[] args) {
		
			benimStatikMetod();
			AnaSinif a = new AnaSinif();
			a.benimPublicMetod();
	}

}
