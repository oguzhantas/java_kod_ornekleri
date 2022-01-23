
public class Main {

	public static void main(String[] args) {
		
		AVM istinyePark = new AVM();	
		
		istinyePark.setCalisanSayisi(1000);
		istinyePark.setDukkanSayisi(500);;
		istinyePark.setMusteriSayisi(2000);
		istinyePark.yaz();
		
		System.out.println("=======");
		AVM torium = new AVM();
		torium.setCalisanSayisi(500);
		torium.setDukkanSayisi(200);;
		torium.setMusteriSayisi(1000);
		torium.yaz();
		

	}

}
