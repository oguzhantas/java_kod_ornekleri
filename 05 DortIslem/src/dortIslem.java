
public class dortIslem {

	public static int topla(int a, int b) {
		int sonuc= a+b;
		return(sonuc);
	}
	
	public static int cikar(int a, int b) {
		int sonuc= a-b;
		return(sonuc);
	}
	
	public static int carp(int a, int b) {
		int sonuc= a*b;
		return(sonuc);
	}
	
	public static double bol(int a, int b) {
		double sonuc=0;
		if(b!=0) {
			sonuc= (double)a/b;
			return(sonuc);
		}	
		else
		{
			System.out.print("Sýfýra bölme hatasý");
			return(0);
		}
	}
	
	public static void main(String[] args) {
	//Metod çaðýrma	
		int x=5;
		int y=7;
		double sonuc;
		sonuc = topla(x,y);		
		System.out.println(sonuc);
		
		sonuc = cikar(x,y);		
		System.out.println(sonuc);
		
		sonuc = bol(x,y);		
		System.out.println(sonuc);
		
		sonuc = carp(x,y);		
		System.out.println(sonuc);
	}
}
