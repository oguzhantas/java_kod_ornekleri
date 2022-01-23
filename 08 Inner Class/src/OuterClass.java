
public class OuterClass {

	int a=5;
	private class InnerClass{
		int b=10;
	}
	public static void main(String[] args) {
		OuterClass disSinif = new OuterClass();
		OuterClass.InnerClass icSinif = disSinif.new InnerClass();
		System.out.println(icSinif.b + disSinif.a);

	}

}
