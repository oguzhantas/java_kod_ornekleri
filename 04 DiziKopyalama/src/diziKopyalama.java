public class diziKopyalama {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {10,20,30,40,50};
		
		System.arraycopy(a,0,b,0,a.length);
		
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);

	}

}
