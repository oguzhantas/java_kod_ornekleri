import java.util.Scanner;
public class SwitchHaftaninGunleri {

	public static void main(String[] args) {
		
		Scanner giris= new Scanner(System.in);
		System.out.print("Haftanın günü:");
		int gun= giris.nextInt();
		String gunStr="";
		
		switch(gun) {
		case 1:
			gunStr="Pazartesi";
			break;
		case 2:
			gunStr="Salı";
			break;
		case 3:
			gunStr="Çarşamba";
			break;
		case 4:
			gunStr="Perşembe";
			break;
		case 5:
			gunStr="Cuma";
			break;
		case 6:
			gunStr="Cumartesi";
			break;
		case 7:
			gunStr="Pazar";
			break;
		default:
			gunStr="Tanımlı değil";
		}
		
		System.out.println(gunStr);

	}

}
