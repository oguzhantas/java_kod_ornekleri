
public class ternaryOperator1 {

	public static void main(String[] args) {
		int puan=60;
		
		String sonuc=(puan>=50)?"Geçti":"Kaldý";
		System.out.println(sonuc);
		
		if(puan>=50)
			System.out.println("Geçti");
		else
			System.out.println("Kaldý");

	}

}
