package soru1;

public class soru5 {

	public static void main(String[] args) {
		int dizi []= {2,5,4,2,12,5,12,8,22,5,9,12,3};
		int eleman[]=new int[dizi.length];
		int adet, sirano=0;boolean var;
		for(int i=0;i<dizi.length;i++) {
			adet=0;
			for(int j=0;j<dizi.length;j++) {
				if (dizi[i]==dizi[j])
					adet++;
				} //for j			
				var=false;
				for(int k=0;k<eleman.length;k++)
				{
					if(dizi[i]==eleman[k])
							var=true;
				}
				if(!var) {
					eleman[sirano]=dizi[i];
					System.out.println(dizi[i]+":"+adet+" var");
					sirano++;
				}
			
			
		}//for i
			
	}
}
