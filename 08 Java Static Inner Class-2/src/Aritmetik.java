public class Aritmetik {
	//Üst alma statik Sýnýfý
	static class UstAlma{
		
		public int kareBul(int x) {
			return(x*x);
		}
		public int ustAl(int x, int y) {
			int sonuc=1;
			for(int i=1;i<=y;i++)
				sonuc*=x;
			return(sonuc);
		}
	}
	
	//Dört Ýþlem statik sýnýfý
	static class DortIslem{
		
		int a, b;
		int sonuc;
		
		public int topla() {
			return(this.a+this.b);
		}
		public int cikar() {
			return(this.a-this.b);
		}
		public int carp() {
			return(this.a*this.b);
		}
		public double bol() {
			if (this.b!=0)
				return(this.a/(double)this.b);
			else
				return(0);
		}
		
	}
	
	public static void yaz(String metin) {
		System.out.println(metin);
	}
	
	public static void main(String[] args) {
		
		//Aritmetik a = new Aritmetik();
		//Aritmetik sýnýfýndan direkt nesne türetilirse
		//Aritmetik sýnýfýnýn yapýcý metodu çalýþýr
		//Aritmetik içindeki statik sýnýflardan nesne 
		//türetilirse Aritmetik yapýcý metodu çalýþmaz
		
		Aritmetik.DortIslem islem1 = new Aritmetik.DortIslem();
		islem1.a=5;
		islem1.b=3;
		int sonuc1= islem1.carp();
		yaz("Çarpma:"+sonuc1);
		
		double sonuc2= islem1.bol();
		yaz("Bölme:"+sonuc2);
		
		int sonuc3 = islem1.topla();
		yaz("Topla:"+sonuc3);
		
		int sonuc4 = islem1.cikar();
		yaz("Çýkar:"+sonuc4);
		
		Aritmetik.UstAlma islem2= new Aritmetik.UstAlma();
		int sonuc5= islem2.kareBul(2);
		yaz("Karebul:"+sonuc5);
		
		int sonuc6= islem2.ustAl(2, 3);
		yaz("Üst Alma:"+sonuc6);
		
		
	}

}
