abstract class Kisi{  
	
	abstract void beslen();  
}  

class AnonimIcSinifTest{  

	public static void main(String args[]){  
  
			Kisi k=new Kisi(){  
			void beslen(){
				System.out.println("Besleniyor,"
						+ "Afiyet olsun..");
			}  
  };  
  k.beslen();  
 }  
}  
