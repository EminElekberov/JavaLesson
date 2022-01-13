package inheerits2;

public class calisan {
	protected String adsoyad,eposta,telefon;

	public calisan(String adsoyad, String eposta, String telefon) {
		this.adsoyad = adsoyad;
		this.eposta = eposta;
		this.telefon = telefon;
	}


	public String giris() {
		return this.adsoyad+" cakisan giris yapdi";
	}


	public String getAdsoyad() {
		return adsoyad;
	}


	public void setAdsoyad(String adsoyad) {
		this.adsoyad = adsoyad;
	}


	public String getEposta() {
		return eposta;
	}


	public void setEposta(String eposta) {
		this.eposta = eposta;
	}


	public String getTelefon() {
		return telefon;
	}


	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public static void listele(calisan[] girisyapanlar) {
		for(calisan c:girisyapanlar) {
			System.out.println(c.giris());
		}
	}
}
