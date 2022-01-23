
public class YerelicSinif {

	 private int puan=70;//deðiþken
	 
	 void goster(){  
	  class Yerel{  
	   void mesajVer(){
		   	System.out.println("Mesaj ver 1");
		   	class Yerel2{
		   		void mesajVer2() {
		   			System.out.println("Mesaj ver 2");
		   		}
		   	}
		   	Yerel2 ys2= new Yerel2();
		   	ys2.mesajVer2();
		   	
	   }  
	  }  
	  Yerel ys=new Yerel();  
	  ys.mesajVer();  
	 }  
	 
	 public static void main(String args[]){  
		 YerelicSinif nesne=new YerelicSinif();  
		 nesne.goster();  
	 }  
}
