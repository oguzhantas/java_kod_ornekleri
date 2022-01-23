
public class diziTopla {
	
	public static int[] sumArray(int[] a, int[] b)
	{
		//burada a ve b dizisinin uzunluðunu ayný 
		//kabul ediyoruz.
		int[] c= new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
		}
		return(c);
		
	}

	public static void main(String[] args) {
		int[] x= {1,3,5,10};
		int[] y= {2,4,6,20};
		int[] z= sumArray(x, y);
		for(int i=0;i<z.length;i++) {
			System.out.println(z[i]);
			
		}
	}
}
