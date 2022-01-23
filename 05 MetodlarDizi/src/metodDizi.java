public class metodDizi {
	
	public static int[] diziKareAl(int dizi[]) {
		int n=dizi.length;
		int kare[]= new int[n];
		for(int i=0;i<n;i++) {
			kare[i]=(int)Math.pow(dizi[i], 2); 
		}
		return kare;
	}
	
	public static void main(String[] args) {
		int a[]= {3,5,7};
		int b[]=new int[a.length];
		b=diziKareAl(a);
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
	}
}
