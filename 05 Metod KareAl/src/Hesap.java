
public class Hesap {

	public static int  kareAl(int n) {
		return(n*n);
	}
	
	public static int ustAl(int x, int y) {
		//x=2, y=3 y tane x
		int sonuc=1;
		for(int i=1;i<=y;i++)
			sonuc*=x;
		return(sonuc);
	}
	
	
	public static void main(String[] args) {
			
		int sayi=5;
		int sonuc=kareAl(sayi);
		System.out.println(sonuc);
		
		int a=2, b=3;
		 sonuc=ustAl(a,b);
		System.out.println(sonuc);
	}

}
