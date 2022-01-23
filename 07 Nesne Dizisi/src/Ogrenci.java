
public class Ogrenci {

	String adi;
	String soyadi;
	double notOrtalama;
	
	public static void main(String[] args) {
	
		Ogrenci o1 = new Ogrenci();
		o1.adi="Furkan";
		o1.soyadi="Aksu";
		o1.notOrtalama=88;
		
		int[] dizi= new int[5];
		Ogrenci[] ogr=new Ogrenci[2];
		
		ogr[0] =new Ogrenci();
		ogr[0].adi="Ali";
		ogr[0].soyadi="Can";
		ogr[0].notOrtalama=85.5;
		
		ogr[1] =new Ogrenci();
		ogr[1].adi="Veli";
		ogr[1].soyadi="Can";
		ogr[1].notOrtalama=95.5;
		
		for(int i=0;i<ogr.length;i++)
		{
			
			System.out.println(ogr[i].adi);
			System.out.println(ogr[i].soyadi);
			System.out.println(ogr[i].notOrtalama);
		}
		
		
	}

}
