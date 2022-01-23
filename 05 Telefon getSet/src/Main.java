
public class Main {

	public static void main(String[] args) {
		Telefon t1 = new Telefon();
		t1.setMarka("Samsung");
		t1.setModel("A3");
		t1.setFiyat(3000);
		
		System.out.println(t1.getMarka());
		System.out.println(t1.getModel());
		System.out.println(t1.getFiyat());
		
		Telefon t2 = new Telefon();
		t2.setMarka("Iphone");
		t2.setModel("M11");
		t2.setFiyat(13000);
		System.out.println(t2.getMarka());
		System.out.println(t2.getModel());
		System.out.println(t2.getFiyat());
		

	}

}
