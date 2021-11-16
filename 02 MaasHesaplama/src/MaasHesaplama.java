import java.util.Scanner;
public class MaasHesaplama {
	public static void main(String[] args) {
		byte gun, saat;
		double ucret, toplam;
		Scanner konsol= new Scanner(System.in);
		
		System.out.println("Çalýþýlan gün sayýsý:");
		gun=konsol.nextByte();
		
		System.out.println("Çalýþtýðý saat:");
		saat=konsol.nextByte();

		System.out.println("Saat baþý ücret:");
		ucret=konsol.nextDouble();
		toplam= gun*saat*ucret;
		
		System.out.println("Toplam maaþ:"+toplam);
	}
}
