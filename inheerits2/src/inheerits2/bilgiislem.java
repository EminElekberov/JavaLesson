package inheerits2;

public class bilgiislem extends memur{
	String gorev;

	public bilgiislem(String adsoyad, String eposta, String telefon, String departman, String mesayi, String gorev) {
		super(adsoyad, eposta, telefon, departman, mesayi);
		this.gorev = gorev;
	}
}
