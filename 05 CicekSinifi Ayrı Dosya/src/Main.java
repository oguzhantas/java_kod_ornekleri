
public class Main {

	public static void main(String[] args) {
		Cicek gul = new Cicek();
		gul.renk="kýrmýzý";
		gul.fiyat=20;
		
		System.out.println("Çiçek adý:"+gul.renk);
		System.out.println("Çiçek fiyatý:"+gul.fiyat);
		gul.fiyatArtir(15);
		System.out.println("Çiçek fiyatý:"+gul.fiyat);		
		gul.fiyatArtir(10);
		System.out.println("Çiçek fiyatý:"+gul.fiyat);		
	}

}
