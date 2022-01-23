
public class YerelicSinif2 {

 private int puan=70;//deðiþken
	 
	 void goster(){  
	
	   int sicaklik=50;//local variable must be final till jdk 1.7 only  
	  class Yerel{  
	   void mesajVer(){
		   	System.out.println(sicaklik);}  
	  }  
	  Yerel ys=new Yerel();  
	  ys.mesajVer();  
	 
	 }  
	 
	public static void main(String[] args) {
		 YerelicSinif2 nesne=new YerelicSinif2();  
		 nesne.goster();  

	}

}
