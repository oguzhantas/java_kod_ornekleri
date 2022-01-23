import java.util.Scanner;
public class AritmetikIslem {

	static boolean notKontrol(double x) {
		return(x>=0 && x<=100);
	}
	
	public static void main(String[] args) {
		
		Scanner giris=new Scanner(System.in);
		System.out.print("Not giriniz:");
		double not = giris.nextDouble();
		if(!notKontrol(not))
			 throw new ArithmeticException("Not 0-100 arasýnda olmalýdýr");
		else
			System.out.println("Not geçerli");
	}

}
