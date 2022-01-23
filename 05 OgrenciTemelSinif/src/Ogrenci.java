
public class Ogrenci {

	private int numara;
	private String adi;
	private String soyadi;
	
	public void setNumara(int _numara) {
		
		this.numara=_numara;
	}
	
	public int getNumara() {
		
		return(this.numara);
	}
	
	public void setAdi(String _adi) {
		if (_adi!=null)
		this.adi=_adi;
	}
	
	public String getAdi() {
		return(this.adi);
	}
	
	public void setSoyadi(String _soyadi) {
		if (_soyadi!=null)
		this.soyadi=_soyadi;
	}
	
	public void bilgiYaz() {
		System.out.println("===============");
		System.out.println("Adý:"+this.adi);
		System.out.println("Soyadý:"+this.soyadi);
		System.out.println("Numara:"+this.numara);
		
	}

}
