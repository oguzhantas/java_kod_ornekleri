import java.util.Scanner;
public class SwitchHafta {

	public static void main(String[] args) {
	
		Scanner giris= new Scanner(System.in);
		System.out.print("Haftanın günü:");
		int gun=giris.nextInt();
		
		switch(gun) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Hafta içi");
			break;
		case 6:
		case 7:
			System.out.println("Hafta sonu");
			break;
		default:
			System.out.println("Tanımlı değil");
		}

	}

}
