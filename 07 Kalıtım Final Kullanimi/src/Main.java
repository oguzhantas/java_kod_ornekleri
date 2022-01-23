
public class Main {

	public static void main(String[] args) {
		Metal metal1= new Metal();
		metal1.ozkutle=2;
		metal1.simge="AU";
		metal1.simgeYaz();
		
		Sandalye sandalye1= new Sandalye();
		sandalye1.boy=20;
		sandalye1.en=10;
		sandalye1.alanHesapla();
		
		Masa masa1 = new Masa();
		masa1.genislik=5;
		masa1.yukseklik=4;
		masa1.alanHesapla();
		
	}

}
