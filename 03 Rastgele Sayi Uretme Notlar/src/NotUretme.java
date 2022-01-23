import java.util.Random;
public class NotUretme {

	public static void main(String[] args) {
		int rnot;
		double ortalama=0, toplam=0;
		Random rastgele = new Random();
		
		for (int i=1;i<=3;i++) {
			rnot =rastgele.nextInt(100)+1;
			toplam+=rnot;
			System.out.println(rnot);
		}
		ortalama=toplam/3;
		System.out.println("Ortalama="+ortalama);
		//Soru: Ortalamanýn altýnda üretilen 
		//sayý adedini bulunuz. 

	}

}
