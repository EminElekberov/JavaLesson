package inherits;

public class guvenlik extends memur{
String  belge;

public guvenlik(String adsoyad, String eposta, String telefon, String departman, String mesayi, String belge) {
	super(adsoyad, eposta, telefon, departman, mesayi);
	this.belge = belge;
}

}
