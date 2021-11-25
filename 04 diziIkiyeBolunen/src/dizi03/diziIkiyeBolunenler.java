package dizi03;
public class diziIkiyeBolunenler {
	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6,7,8,9,10,34};
		int sayac=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0) {
				System.out.println(a[i]);
				sayac++;
			}			
		} //for
		System.out.println(sayac+" tane çift sayý var");
	}

}
