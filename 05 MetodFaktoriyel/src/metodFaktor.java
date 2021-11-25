
public class metodFaktor {

	public static int faktoriyel(int x) {
		
		if(x==0 || x==1)
			return 1;
		else {
			int fakt=1;
			for(int i=1;i<=x;i++)
				fakt*=i;
			return fakt;	
		}
		
	}
	
	public static void main(String[] args) {
		
		//int n=10;
		//double toplam=0;
		// 1/1! +1/2!+....+1/n!
		//for(int i=1;i<=n;i++)
		//	toplam+=1.0/faktoriyel(i);
		int sonuc=faktoriyel(5);
		System.out.println("Sonuç:"+sonuc);
	}
}
