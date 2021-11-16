
public class diziNotKarsilastirma {

	public static void main(String[] args) {
	
		double notlar[]= {55.5, 60,70,40,20,60};
		int gecenSayisi=0;
		
		for(int i=0;i<notlar.length;i++) {
			
			if(notlar[i]>=50)
				gecenSayisi++;
		}
		System.out.println("Geçen sayýsý:"+gecenSayisi);
		double basari = 100*gecenSayisi/(notlar.length);
		System.out.println("Baþarý:"+basari);

	}

}
