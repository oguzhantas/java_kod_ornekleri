public class Sirket {
	
	  String adi; //özellik=attribute
	 private double sermaye; //özellik
	 private int calisanSayisi; //özellik
	
	public void setAdi(String _adi) {
		if(_adi!=null)
			this.adi=_adi;
	}
	public String getAdi() {
		return(adi);
	}
	public void setSermaye(double _sermaye) {
		this.sermaye=_sermaye;
	}
	public double getSermaye() {
		return(sermaye);
	}
	
	public void setCalisanSayisi(int _calisanSayisi)
	{	
		if(_calisanSayisi>0)
		this.calisanSayisi=_calisanSayisi;
	}
	
	public int getCalisanSayisi()
	{
		return calisanSayisi;
	}
}
