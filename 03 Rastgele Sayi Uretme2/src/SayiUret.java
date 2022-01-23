import java.util.Random;
public class SayiUret {

	public static void main(String[] args) {

		Random rand = new Random();
		
		for(int i=0;i<10;i++) {		
			double sayi = rand.nextDouble();
			sayi=Math.round(sayi*1000.0)/1000.0;
			System.out.println(sayi);
		}
	}
}
