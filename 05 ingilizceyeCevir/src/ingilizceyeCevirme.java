
public class ingilizceyeCevirme {

	public static String cevir(String metin) {
		
		char[] bilgi = metin.toCharArray();
		for(int i=0;i<metin.length();i++)
		{
			if(bilgi[i]=='Ч') bilgi[i]='C';
			else if(bilgi[i]=='о') bilgi[i]='S';
			else if(bilgi[i]=='ж') bilgi[i]='O';
			else if(bilgi[i]=='м') bilgi[i]='U';
			else if(bilgi[i]=='а') bilgi[i]='G';
		}
		String sonuc=String.valueOf(bilgi);
		return(sonuc);
	}
	public static void main(String[] args) {
		String str="ЧARоI жамDм";
		System.out.println(cevir(str));

	}

}
