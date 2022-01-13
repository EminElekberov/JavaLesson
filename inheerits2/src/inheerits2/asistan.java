package inheerits2;

public class asistan extends akademisyen{
	protected String yukseklisans;

	public asistan(String adsoyad, String eposta, String telefon, String bolum, String gorevler, String ders,
			String yukseklisans) {
		super(adsoyad, eposta, telefon, bolum, gorevler, ders);
		this.yukseklisans = yukseklisans;
	}
	public String giris() {
		return "asistan"+super.giris();
	}
	public String getYukseklisans() {
		return yukseklisans;
	}

	public void setYukseklisans(String yukseklisans) {
		this.yukseklisans = yukseklisans;
	}
}
