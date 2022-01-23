
public class Gemi {
	
	int en=100;
	int boy=20;
	
	static class Yat{
		int yolcuSayisi=20;
		
	}
	
	public static void main(String[] args) {
		//Gemi g = new Gemi();
		//Gemi.Yat y = g.new Yat();
		Gemi g = new Gemi();
		System.out.println("Geminin eni:"+g.en);
		System.out.println("Gemi boyu:"+g.boy);
		
		Gemi.Yat y= new Gemi.Yat();
		System.out.println("Yolcu Sayýsý:"+y.yolcuSayisi);
		
	}
}
