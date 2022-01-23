public class Otomobil extends Arac {
	
	//özellik
	int yolcuSayisi;
	
	//metodlar
	public Otomobil() {
		System.out.println("Otomobil yapýcý sýnýfý çaðrýldý");
	}
	
	
	public void yolcuTasi() {
		System.out.println(yolcuSayisi+" kadar yolcu taþýr");
	}
	
	public void ozellikYaz() 
	{
		
		super.ozellikYaz();
		System.out.println("Yolcu sayýsý:"+yolcuSayisi);
	}

}



