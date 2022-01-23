
public class bilgisayarSinifi {

	String marka; //Lenovo, Dell
	int bellekBoyutu; //RAM
	String islemci; //i3 i5, i7, i9
	int sabitDiskBoyutu; //250,500,1000 GB
		
	
	public static void main(String[] args) {
		
		bilgisayarSinifi bil1=new bilgisayarSinifi();
		bil1.marka="Lenovo";
		bil1.islemci="i7 7700HQ";
		bil1.bellekBoyutu=16;
		bil1.sabitDiskBoyutu=1000;

		bilgisayarSinifi bil2=new bilgisayarSinifi();
		bil2.marka="Dell";
		bil2.islemci="i5";
		bil2.bellekBoyutu=8;
		bil2.sabitDiskBoyutu=500;
	}
}
