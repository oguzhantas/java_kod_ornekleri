import java.util.Scanner;

public class soru7 {
	
	public static int faktoriyel(int n) {
		if(n==0 || n==1)
			return 1;
		else {
			int fakt=1;
			for(int i=1;i<=n;i++)
				fakt*=i;
			return(fakt);
		}
	}
	
	public static void main(String[] args) {
		Scanner giris= new Scanner(System.in);
		System.out.print("n deðerini giriniz:");
		int n= giris.nextInt();
		double sonuc=0;
		
		for(int i=1;i<=n;i++)
			sonuc+=1.0/faktoriyel(i);
		System.out.print("sonuç:"+sonuc);

	}

}
