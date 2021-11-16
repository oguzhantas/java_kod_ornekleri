
public class while3toplam {

	public static void main(String[] args) {
		
		int i=1, toplam=0;
		
		while(i<=100) {
			if(i%5==0 && i%3==0)
			{
				System.out.println(i);
				toplam+=i;
			}
			i++;
		}//while
		System.out.println("Toplam:"+toplam);

	}

}
