
public class diziEnBuyukBul {

	public static void main(String[] args) {
		
		int a[]= {3,8,5,11,34,4};
		int enbuyuk=a[0];
		int enkucuk=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>enbuyuk)
				enbuyuk=a[i];
		
			if(a[i]<enkucuk)
				enkucuk=a[i];
		}
		System.out.println("En büyük:"+enbuyuk);
		System.out.println("En küçük:"+enkucuk);
	}

}
