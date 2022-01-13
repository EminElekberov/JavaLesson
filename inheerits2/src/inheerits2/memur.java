package inheerits2;

public class memur extends calisan{
	String departman,mesayi;

	public memur(String adsoyad, String eposta, String telefon, String departman, String mesayi) {
		super(adsoyad, eposta, telefon);
		this.departman = departman;
		this.mesayi = mesayi;
	}
}
