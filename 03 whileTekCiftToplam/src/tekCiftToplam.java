
public class tekCiftToplam {
	public static void main(String[] args) {
		
		int i=1;
		int tekToplam=0, ciftToplam=0;
		
		while(i<=5000) {
			
			if(i%2==0)
				ciftToplam+=i;
			else if(i%2==1)
				tekToplam+=i;
			i++;
		}
		System.out.println("Tek sayý toplamý:"+tekToplam);
		System.out.println("Çift sayý toplamý:"+ciftToplam);
		

	}

}
