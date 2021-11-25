
public class Dizi3Boyut {

	public static void main(String[] args) {
		int[][][] dizi = {
	            {
	              {1, 2, 3}, 
	              {5, 6, 7}
	            }, 
	            { 
	              {-2, -1, 0, 1}, 
	              {3}, 
	              {4, 5}
	            } 
	        };

	         for (int[][] dizi2B: dizi) {
	            for (int[] dizi1B: dizi2B) {
	                for(int eleman: dizi1B) {
	                    System.out.println(eleman);
	                }
	            }
	        }
	}
}
