
public class Kopek extends Hayvanlar {

	String kopekTur;
	
	//Bu metod Hayvanlar sýnýfýndaki sesCikar metodunu
	// eziyor(override)
	public void sesCikar() {
		System.out.println("Havlýyor...");
	}
	
	public void avlan() {
		System.out.println("Köpek avlanýyor...");
	}
}
