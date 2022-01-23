public class metodDiziTopla {

	public static int topla(int a[]) {
		int sonuc=0;
		for(int i=0;i<a.length;i++) {
			sonuc+=a[i];
		}
		return(sonuc);
	}
	
	public static void main(String[] args) {
		
		int dizi[]= {10,5,11,3,11,2};
		System.out.println(topla(dizi));
	}
}
