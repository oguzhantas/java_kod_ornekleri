
public class Cam {

	String renk="Mavi";
	
	 class Bardak{
		String kalinlik="5";
	}
	
	 public static void main(String[] args) {
		 Cam c = new Cam();
		 Cam.Bardak b = c.new Bardak(); //Yeni
		
		 
		 System.out.println(c.renk);
		 System.out.println(b.kalinlik);
	 }
}
