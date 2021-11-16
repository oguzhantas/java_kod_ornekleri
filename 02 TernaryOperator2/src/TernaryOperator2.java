
public class TernaryOperator2 {

	public static void main(String[] args) {
		
		int sayi=5;
		String sonuc=(sayi%2==0)
				?"Ýkiye bölünür"
				:"Ýkiye Bölünemez";
		System.out.println(sonuc);
		
		if(sayi%2==0)
			sonuc="Ýkiye bölünür";
		else
			sonuc="Ýkiye bölünmez";
		System.out.println(sonuc);
	}

}
