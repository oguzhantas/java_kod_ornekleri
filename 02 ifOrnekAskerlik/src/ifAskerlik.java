import java.util.Scanner;
public class ifAskerlik {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int dogumtarihi; 
		char cinsiyet;
		
		System.out.print("Cinsiyetiniz (E/K)");
		cinsiyet= giris.next().charAt(0);
	
		if(cinsiyet=='K' || cinsiyet=='k'){
			System.out.println("Kizlar henuz askere alinmiyor");
			
		}else if(cinsiyet=='E' || cinsiyet=='e')
		{
			System.out.print("Dogum tarihiniz:");
			dogumtarihi= giris.nextInt();
			int yas =2021-dogumtarihi;
			if(yas>=18)
				System.out.println("Askere gidebilirsin");
			else
				System.out.print("Askerlik icin kucuksunuz");
		}
			
		

	}

}
