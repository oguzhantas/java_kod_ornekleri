abstract class Bisiklet{  
  
	abstract void pedalCevir(); //mutlaka ezilecek
	abstract void zilCal(); //mutlaka ezilecek
	
}  

class  dagBisikleti extends Bisiklet{  
	void pedalCevir(){
		System.out.println("çalýþýyor...");
	} 
	
	void zilCal() {
		System.out.println("Zil çalýþýyor...");
	}

	public static void main(String args[]){  
			dagBisikleti bisiklet1 = new dagBisikleti();  
			bisiklet1.pedalCevir();
			bisiklet1.zilCal();
	}  
}  
