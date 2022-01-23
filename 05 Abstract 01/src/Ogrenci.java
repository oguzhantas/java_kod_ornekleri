abstract class insan{
	
	 String adi="Ali";
	 int yas=45;
	 int mezunYili=2021;
	 abstract void calis(); //soyut metod
	 abstract void oku();
}


 class Ogrenci extends insan{
		
		public void calis() {
			System.out.println("Çalýþ, daha çok çalýþ");
		}
		
		public void oku() {
			System.out.println("Okuma yapýlýyor...");
		}
		
		public static void main(String[] args) {
			insan o1= new Ogrenci();
			
			System.out.println("Adý:"+o1.adi);
			System.out.println("Yaþ:"+o1.yas);
			System.out.println("Mezuniyet Yýlý:"+o1.mezunYili);
			
			o1.calis();

		}
}
	





