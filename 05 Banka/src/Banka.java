
public class Banka {

	double bakiyeTL;
	double bakiyeEUR;
	double bakiyeUSD;
	double bakiyeAU;
	
	public void paraCek(double miktar, String paraBirim)
	{
		System.out.println("Para çekiliyor");
		if(paraBirim=="TL")
			bakiyeTL-=miktar;
		else if(paraBirim=="USD")
			bakiyeUSD-=miktar;
		else if(paraBirim=="EUR")
			bakiyeEUR-=miktar;
		else if(paraBirim=="AU")
			bakiyeAU-=miktar;
		
	}
	
	public void paraYatir(double miktar, String paraBirim) {
		System.out.println("Para yatýrýlýyor");
		if(paraBirim=="TL")
			bakiyeTL+=miktar;
		else if(paraBirim=="USD")
			bakiyeUSD+=miktar;
		else if(paraBirim=="EUR")
			bakiyeEUR+=miktar;
		else if(paraBirim=="AU")
			bakiyeAU+=miktar;
		
	}
	
	public void bakiyeGoster() {
		System.out.println("=========================");
		System.out.println("TL Bakiyeniz:"+bakiyeTL);
		System.out.println("USD Bakiyeniz:"+bakiyeUSD);
		System.out.println("EUR Bakiyeniz:"+bakiyeEUR);
		System.out.println("AU Bakiyeniz:"+bakiyeAU);
		System.out.println("=========================");
	}
	
	public static void main(String[] args) {
	
		Banka abc=new Banka();
		abc.paraYatir(200,"TL");
		abc.paraYatir(300,"USD");
		abc.paraYatir(20, "AU");
		abc.paraYatir(40, "EUR");
		abc.bakiyeGoster();
		
		abc.paraCek(50,"TL");
		abc.paraCek(10,"EUR");
		abc.paraCek(10,"USD");
		abc.paraCek(10,"AU");
		abc.bakiyeGoster();
	

	}

}
