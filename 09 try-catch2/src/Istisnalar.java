
public class Istisnalar {

	public static void main(String[] args) {
		
		try {
			int[] a= {1,3,5,7,9};
			System.out.println(a[5]);
		
		}catch(Exception e) {
			System.out.println("Bir hata oluþtu =>"+e.toString());
			
		}finally {
			System.out.println("Program sonlandý");
		}
	}
}
