public class Personel {
	//personel özellikleri (attributes)
	String adi;
	String soyadi;
	String TCKimlikNo;
	String telefon;
	double Maas;
	int dogumTarihi;
	
	public int yasHesapla(int dogtar) {
		int yas=2021-dogtar;
		return(yas);
	}
	public static void main(String[] args) {
	
		Personel p1 = new Personel();
		p1.adi="Oðuzhan";
		p1.soyadi="Taþ";
		p1.Maas=4250;
		p1.TCKimlikNo="12345678912";
		p1.telefon="0533 555 55";
		p1.dogumTarihi=1976;
		int pyas=p1.yasHesapla(p1.dogumTarihi);
		System.out.print("Yaþý:"+pyas);
	}

}
