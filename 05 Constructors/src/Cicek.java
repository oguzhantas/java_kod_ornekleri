public class Cicek {

	String cicekAdi;
	
	public Cicek() {
		cicekAdi="Gül";
	}
	public static void main(String[] args) {
		Cicek c1= new Cicek();
		System.out.println(c1.cicekAdi);
		
		Cicek c2 = new Cicek();
		System.out.println(c1.cicekAdi);
	
	}
}
