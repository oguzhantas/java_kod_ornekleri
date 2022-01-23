
public class Desktop extends Bilgisayar{

	boolean oyuncuKlavye;
	boolean oyuncuFare;

	public void ozellikYaz() {
		super.ozellikYaz();
		System.out.println("Oyuncu Klavyesi"+oyuncuKlavye);
		System.out.println("Oyuncu Fare"+oyuncuFare);
			
	}
}
