import java.util.Scanner;

public class bilgiAlma {

	public static void main(String[] args) {
		int s1, s2, toplam;
		 Scanner konsol = new Scanner(System.in);
		 System.out.print("1. Sayý");
		 s1 = konsol.nextInt();
	     System.out.print("2. Sayý");
	     s2 = konsol.nextInt();
	     toplam=s1+s2;
	     System.out.print("Toplam:"+toplam);
	}

}
