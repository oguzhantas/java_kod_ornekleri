//özet sýnýfý tanýmlýyoruz
abstract class Sekil{  
	abstract void ciz();  //mutlaka bu metod alt sýnýflarda olacak	
}  

class Kare extends Sekil{  
	void ciz(){System.out.println("Kare Çiz.");}  
}  
class Daire extends Sekil{  
	void ciz(){System.out.println("Daire Çiz.");}  
}

class Dikdortgen extends Sekil{
	void ciz() { System.out.println("Dikdörtgen çiz");}
}

class Geometri{  
	public static void main(String args[]){  
		Sekil s=new Daire();  
		s.ciz();  
		
		Dikdortgen dikd = new Dikdortgen();
		dikd.ciz();
		
		Kare kr = new Kare();
		kr.ciz();
	}  
} 

