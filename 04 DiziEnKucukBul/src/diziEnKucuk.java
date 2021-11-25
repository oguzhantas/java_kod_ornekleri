
public class diziEnKucuk {

	public static void main(String[] args) {
	
		
		int a[]= {30,8,12,2,14,5,1,20,18};
		int enkucuk=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<enkucuk)
				enkucuk=a[i];	
		}
		System.out.println("En küçük:"+enkucuk);

	}

}
