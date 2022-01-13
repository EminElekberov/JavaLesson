
public class akademisyen implements Cp251{
private String adsoyad,bolum,gorevler;



public akademisyen(String adsoyad, String bolum, String gorevler) {
	this.adsoyad = adsoyad;
	this.bolum = bolum;
	this.gorevler = gorevler;
}
@Override
public void giris() {
	System.out.println("giris etdiniz");
}
public void setGorevler(String gorevler) {
	this.gorevler = gorevler;
}
@Override
public void cixis() {
	// TODO Auto-generated method stub
	
}
@Override
public boolean yemek(int saat) {
	// TODO Auto-generated method stub
	return false;
}
public String getAdsoyad() {
	return adsoyad;
}

public void setAdsoyad(String adsoyad) {
	this.adsoyad = adsoyad;
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





}
