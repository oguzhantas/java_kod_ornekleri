
public class DiziCarpimMetodu {
	
	public static int[] diziCarp(int[] a, int[] b)
	{
		int[] c = new int[a.length];
		if (a.length!=b.length) {
			System.out.println("A ve B dizileri ayný boyutta olmalýdýr" );			
			return c;
		} else {
			
			for(int i=0;i<c.length;i++) {
				c[i]=a[i]*b[i];
			}
			return c;
			
		}
		
		
	}
	public static void main(String[] args) {
		int[] x= {1,3,5,7};
		int[] y= {3,4,5,6};
		int[] z = diziCarp(x, y);
		for(int i=0;i<z.length;i++) {
			System.out.println(z[i]);
		}
				

	}

}
