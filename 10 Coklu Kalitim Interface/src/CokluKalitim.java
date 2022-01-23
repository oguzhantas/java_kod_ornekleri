interface Hesapla1{
	public void mesajYaz(); 
}

interface Hesapla2{
	public void mesajYaz(); 
}



class CokluKalitim implements Hesapla1, Hesapla2 {

	public void mesajYaz() {
		System.out.println("Mesaj verildi...");
		
	}
	public static void main(String[] args) {
		
		CokluKalitim nesne = new CokluKalitim();
		nesne.mesajYaz();
		
	}

}
