
public class kumSaati {

	public static void main(String[] args) {
		//Kum saatinin üstü
		for(int i=5;i>=1;i--)
		{
			for(int k=1;k<=5-i;k++)
				System.out.print(" ");
			
			for(int j=1;j<=i*2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//Kum saatinin altý
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
				System.out.print(" ");
			
			for(int j=1;j<=i*2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
