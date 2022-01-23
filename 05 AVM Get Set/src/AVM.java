
public class AVM {

	private int calisanSayisi;
	private int dukkanSayisi;
	private int musteriSayisi;
	
	// setter metodlarý atama yapar
	public void setCalisanSayisi(int _calisansay)
	{
		this.calisanSayisi=_calisansay;	
	}
	
	public void setDukkanSayisi(int _dukkansay)
	{
		this.dukkanSayisi=_dukkansay;
	}
	
	public void setMusteriSayisi(int _musterisay) {
		this.musteriSayisi=_musterisay;
	}
	//getter metodlar okuma yapar
	public int getCalisanSayisi() {
		return(this.calisanSayisi);
	}
	
	public int getDukkanSayisi() {
		return (this.dukkanSayisi);
	}
	
	public int getMusteriSayisi() {
		return (this.musteriSayisi);
	}
	
	public void yaz() {
		System.out.println("Müþteri Sayýsý:"+this.getMusteriSayisi());
		System.out.println("Dükkan Sayýsý:"+this.getDukkanSayisi());
		System.out.println("Çalýþan Sayýsý:"+this.getCalisanSayisi());
		
	}
	
}
