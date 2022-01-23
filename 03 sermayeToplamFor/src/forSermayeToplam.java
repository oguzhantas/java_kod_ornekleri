public class forSermayeToplam {
	public static void main(String[] args) {
	
		double sermaye=1000;
		int i=1;
		while(i<=20) {
			sermaye+= sermaye*10/100;
			System.out.println(i+".yýl sonu sermaye="+sermaye);
			i++;
		}
	
		//System.out.println("Son i deðeri:"+i);
	}

}
