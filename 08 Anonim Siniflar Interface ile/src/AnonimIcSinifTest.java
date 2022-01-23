interface Yemek{  
	void beslen();  
}  

public class AnonimIcSinifTest {
	public static void main(String[] args) {
	
		Yemek y=new Yemek(){  
		public void beslen(){
			System.out.println("nice fruits");
		}  
	  };  
	  y.beslen();  
	}
}
