import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner giris= new Scanner(System.in);
	
		Ogrenci o1 = new Ogrenci();
		o1.setAdi("Osman");
		o1.setSoyadi("Can");
		o1.setNumara(111);
		o1.bilgiYaz();

		Ogrenci o2 = new Ogrenci();
		o2.setAdi("Ali");
		o2.setSoyadi("Kaya");
		o2.setNumara(222);
		o2.bilgiYaz();

		
		//int[] a= new int[9]; 
		Ogrenci[] ogr=new Ogrenci[5];
		
		/*ogr[0]=new Ogrenci();
		ogr[0].setAdi("Seyda");
		ogr[0].setSoyadi("Can");
		ogr[0].setNumara(333);;
		
		ogr[1]=new Ogrenci();
		ogr[1].setAdi("Ali");
		ogr[1].setSoyadi("Cansu");
		ogr[1].setNumara(444);;*/
		
		for(int i=0;i<5;i++) {
			ogr[i]=new Ogrenci();
			System.out.print("Öðrenci adý:");
			String adi= giris.next();
			ogr[i].setAdi(adi);
			
			System.out.print("Öðrenci Soyadý:");
			String soyadi= giris.next();
			ogr[i].setSoyadi(soyadi);
			
			System.out.print("Öðrenci Numarasý:");
			int numara= giris.nextInt();
			ogr[i].setNumara(numara);
			System.out.println();
		}
		
		
		//Öðrencilerin bilgileri yazdýrýlýyor
		 
	}

}
