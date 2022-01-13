package inherits;

public class ogretimuyesi extends akademisyen{
String unvan;

public ogretimuyesi(String adsoyad, String eposta, String telefon, String bolum, String gorevler, String ders,
		String unvan) {
	super(adsoyad, eposta, telefon, bolum, gorevler, ders);
	this.unvan = unvan;
}
public String giris() {
	return this.unvan+" "+ super.giris();
}
}
