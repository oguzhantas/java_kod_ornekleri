
public class Kamyon extends Arac {
	
	int yukKapasitesi;
	
	public void yukTasi() {
		System.out.println(yukKapasitesi+" kadar yük taþýr");
	}
	
	public void ozellikYaz() {
		super.ozellikYaz();
	
		System.out.println("Yük Kapasitesi:"+yukKapasitesi);
	}

}
