import java.util.Scanner;
public class forBaslangicBitis {
	public static void main(String[] args) {
		
		Scanner giris= new Scanner(System.in);
		int baslangic, bitis,artim;
		System.out.println("Baslangic:");
		baslangic= giris.nextInt();
		
		System.out.println("Bitis:");
		bitis= giris.nextInt();
		
		System.out.println("Artim:");
		artim= giris.nextInt();
		
		for(int i=baslangic; i<=bitis; i+=artim)
		{
			System.out.println(i);
		}
	}

}
