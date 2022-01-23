import java.util.Scanner;
public class forFaktoriyel1 {
	public static void main(String[] args) {

		Scanner giris= new Scanner(System.in);
		System.out.print("Faktöriyeli alýncak sayý:");
		int n= giris.nextInt();
		
		if (n==0) 
			System.out.println("Sonuç:"+1);
		else {
			int fakt=1;
			for(int i=1;i<=n;i++) {
				System.out.println("Deðer:"+fakt);
				fakt=fakt*i;
			}
			System.out.println("Sonuç:"+fakt);
		}
	}
}
