package bitselIslemler;

public class bitselISlemler {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		System.out.println("a="+Integer.toBinaryString(a));
		System.out.println("b="+Integer.toBinaryString(b));

		System.out.println("a^b="+ (a^b));
		System.out.println("a|b="+ (a&b));
		System.out.println("a&b="+ (a&b));
		System.out.println("~a="+ (~a));
		System.out.println("a>>1="+ (a>>1));
		System.out.println("a>>>1="+ (a>>>1));
		System.out.println("a<<1="+ (a<<1));
	}

}
