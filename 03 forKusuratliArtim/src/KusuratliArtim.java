import java.text.DecimalFormat;

public class KusuratliArtim {

	public static void main(String[] args) {

		// -2'den baþlayýp 1'e kadar 0.1 aralýklarla
		// giden bir döngü oluþturalým.
		DecimalFormat df = new DecimalFormat("#.00");
		
		for(float i=-2; i<=1.0 ;i+=0.1) {
			System.out.println(df.format(i));
		}
		
	}

}
