import java.util.Arrays;
public class DiziBoyutDegistirme {

	public static void main(String[] args) {
		 
			int[] a = {1, 2, 3};
		 
		    a = Arrays.copyOf(a, a.length+1);
		    for (int i : a)
		        System.out.println(i);
		    
		  //  Object[] x = new Object[5]; //eski dizi  
		  //  Object[] y = new Object[10]; //yeni dizi
		  //  System.arraycopy(x, 0, y, 0, x.length);

	}
}
