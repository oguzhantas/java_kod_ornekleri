
public class Soru6 {

	public static boolean tekCift(int sayi) {
		if(sayi%2==0)
			return(true);
		else
			return(false);
	
	}
	
	public static int tekTopla(int s) {
		int sonuc=0;
		for(int i=1;i<=s;i++) {
			if(i%2==1)
				sonuc+=i;
		}
		return(sonuc);
	}

	public static int ciftTopla(int s) {
		int sonuc=0;
		for(int i=1;i<=s;i++) {
			if(i%2==0)
				sonuc+=i;
		}
		return(sonuc);
		
	}
	public static void main(String[] args) {
		
		int n=10, sonuc=0;
		if(tekCift(n))
			sonuc=ciftTopla(n);
		else
			sonuc=tekTopla(n);
		
		System.out.println(sonuc);
	}

}
