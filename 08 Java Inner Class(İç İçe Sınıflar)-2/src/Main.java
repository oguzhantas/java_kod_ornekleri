public class Main {

	public static void main(String[] args) {
		Ucak ucak = new Ucak();
		Ucak.JumboJet jumbo = ucak.new JumboJet();
		System.out.println("Yolcu sayýsý:"+ucak.yolcuSayisi);
		System.out.println("Personel Sayýsý:"+jumbo.personelSayisi);
	}

}
