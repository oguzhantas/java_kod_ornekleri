import java.util.Scanner;

public class SwitchCaseOrnek1 {

	public static void main(String[] args) {
	
	byte secim;
	System.out.print("1)Ýlkbahar");
	System.out.print("2)Yaz");
	Scanner konsol= new Scanner(System.in);
	secim=konsol.nextByte();
	
	switch (secim){
	case 1:
		System.out.println("Mart-Nisan-Mayýs");
		break;
	case 2:
		System.out.println("Haziran-Temmuz-Aðustos");
		break;
	default:
		System.out.println("1 veya 2 giriniz");
	}
		

	}

}
