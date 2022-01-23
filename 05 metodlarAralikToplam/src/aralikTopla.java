
public class aralikTopla {

	public static int topla(int basla, int bitis) {
		int toplam=0;
		for(int i=basla;i<=bitis;i++)
			toplam+=i;
		
		return(toplam);
	}
	
	public static void main(String[] args) {
		System.out.println(topla(1,100));
		//System.out.println(topla(10,20));
	}
}
