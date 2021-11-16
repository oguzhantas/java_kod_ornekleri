package asalKontrol;
import java.util.Scanner;

public class asalSayiKontrol {
	
	public static void main(String[] args){

		Scanner giris = new Scanner(System.in);
		boolean asal=true;
		int i;
		System.out.print("Bir sayý giriniz:");
		int sayi=giris.nextInt();
		
		if(sayi==0 || sayi==1) {
			asal=false;
			
		} else {
			for(i=2;i<sayi;i++){
				if(sayi%i==0){
					asal=false;
					break;
				}
			}
			
		}
		
		if(asal){
			System.out.print("Asal");
		}else{
			System.out.print("Asal deðil");
		}
	}
}
