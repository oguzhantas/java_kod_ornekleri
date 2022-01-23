/*
* NOT: ayný dosya içinde ise private
* özelliklere eriþim mümkündür, farklý
* dosyadan eriþim mümkün deðildir. 
*/
public class Main {

	public static void main(String[] args) {
		
		Sirket abc= new Sirket();
	
		abc.setAdi("ABC Holding");
		abc.setCalisanSayisi(100);
		abc.setSermaye(1000000);

		System.out.println("Þirket Adý:"+abc.getAdi());
		System.out.println("Çalýþan Sayýsý:"+abc.getCalisanSayisi());
		System.out.println("Sermaye:"+abc.getSermaye());
	}
}
