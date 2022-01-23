public class otomobil {
	String renk; //özellik
	int vitesSayisi; //özellik
	String yakitTipi; //özellik
	int yolcuSayisi;
	int maksimumHiz;
	int aktifHiz;
	
	public void hizlan(int hiz) {
		System.out.println("Araba hýzlanýyor");
		aktifHiz = aktifHiz+hiz;
	};
	
	public void yavasla(int hiz) {
		System.out.println("Araba yavaþlýyor");
		aktifHiz = aktifHiz-hiz;
	};
	
	public void hizGoster() {
		System.out.println("Þu andaki hýzý:"+aktifHiz);
	}

	public static void main(String[] args) {
		
		otomobil Mercedes = new otomobil();
		Mercedes.renk="Beyaz";
		Mercedes.vitesSayisi=7;
		Mercedes.yakitTipi="Dizel";
		Mercedes.yolcuSayisi=5;
		
		System.out.println("Renk:"+Mercedes.renk);
		System.out.println("Vites sayýsý:"+Mercedes.vitesSayisi);
		System.out.println("Yakýt Tipi"+Mercedes.yakitTipi);
		System.out.println("Yolcu sayýsý:"+Mercedes.yolcuSayisi);
		Mercedes.hizlan(20);
		Mercedes.hizGoster();
		Mercedes.hizlan(30);
		Mercedes.hizGoster();
		Mercedes.yavasla(15);
		Mercedes.hizGoster();
	
		
	}

}
