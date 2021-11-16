import java.util.Scanner;

public class ifOrnekTakim {

	public static void main(String[] args) {
		Scanner konsol= new Scanner(System.in);
		System.out.println("1.Takým Skoru:");
		byte t1=konsol.nextByte();
		
		System.out.println("2.Takým Skoru:");
		byte t2=konsol.nextByte();
		
		if(t1>t2)
			System.out.println("1.Takým kazandý");
		else if(t1<t2)
			System.out.println("2.Takým kazandý");
		else if (t1==t2)
			System.out.println("Berabere");
	}
}
