
public class formulHesapla {

	public static int ustAl(int x, int y)
	{
		int sonuc=1;
		//x=2, y=5 ise 2 üzeri 5 demek;
		//5 tane 2'nin çarpýlmasý
		for(int i=1;i<=y;i++)
			sonuc*=x;
		return sonuc;
	}
	
	public static void main(String[] args) {
		
		int x=2;
		// y = 5x^3 + 2x^2 +5
		int y= 5*ustAl(x,3)+2*ustAl(x,2)+5;
		System.out.println(y);	
	}
}
