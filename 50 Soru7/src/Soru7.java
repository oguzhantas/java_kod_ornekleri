import java.util.Scanner;

public class Soru7 {

	public static void main(String[] args) {
		Scanner giris= new Scanner(System.in);
		System.out.print("n deðerini giriniz:");
		int n= giris.nextInt();
		
		double toplam=0;
		boolean arti=true;
		for(int i=1;i<=n;i+=2) {
			if(arti) {
				System.out.println("+4/"+i);
				toplam+= 4.0/i; //toplam+=(double)4/i;
				arti=false;
			}else {
				System.out.println("-4/"+i);
				toplam-= 4.0/i; //toplam-=(double)4/i;
				arti=true;
			}
		}
			
		System.out.println("Toplam:"+toplam);	
	}
}
