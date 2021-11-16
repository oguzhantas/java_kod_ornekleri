import java.util.Scanner;

public class ifOrnekBool {

	public static void main(String[] args) {
		
		boolean gecti=true;
		Scanner giris = new Scanner(System.in);
		double yilSonuNotu;
		
		System.out.print("Yýl sonu notunuz:");
		yilSonuNotu=giris.nextDouble();
		
		if(yilSonuNotu>=50)
			gecti=true;
		else
			gecti=false;
		
		if(!gecti)
			System.out.println("Hangi derslerden geçemediniz");
			//Derslerin adlarý alýnabilir
		
		else{
			System.out.print("Ýþ buldunuz mu?");
			//Evet veya hayýr cevap alýrýz
			
		}
	}

}
