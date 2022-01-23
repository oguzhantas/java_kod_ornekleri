
abstract class TemelIslemler{
	abstract public int topla(int a, int b);
}

abstract class TemelIslemler2 extends TemelIslemler{
	abstract public int carpma(int a, int b);
	
}

public class Matematik extends TemelIslemler2 {

	public int carpma(int a, int b) {
		return(a*b);
	}
	
	public int topla(int a, int b){
		return(a+b);
	}
}
