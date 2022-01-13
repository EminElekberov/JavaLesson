package inherits;

public class akademisyen extends calisan{
String bolum,gorevler;
String ders;

public akademisyen(String adsoyad, String eposta, String telefon,String bolum, String gorevler, String ders) {
	super(adsoyad,eposta,telefon);
	this.bolum = bolum;
	this.gorevler = gorevler;
	this.ders = ders;
}

public void dersegir() {
	System.out.println("derse girildi.");
}
public String  giris() {
	return super.giris()+" giris yapildi. A qapisindan.";
}

public String getBolum() {
	return bolum;
}

public void setBolum(String bolum) {
	this.bolum = bolum;
}

public String getGorevler() {
	return gorevler;
}

public void setGorevler(String gorevler) {
	this.gorevler = gorevler;
}

public String getDers() {
	return ders;
}

public void setDers(String ders) {
	this.ders = ders;
}


}
