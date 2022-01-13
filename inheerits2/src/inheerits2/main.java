package inheerits2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		akademisyen a=new akademisyen("emin","emin@gmail.com","0519788378","cenk","hoca","riyaziyyat");

		
		ogretimuyesi o=new ogretimuyesi("neci","n@gmail.com","054465785","ramin","hoca","kimya","docent");
		
		//calisan c=new akademisyen("emin","emin@gmail.com","0519788378","cenk","hoca","riyaziyyat");
		calisan[] girislistesi={a,o};
		
		calisan.listele(girislistesi);
		
		
	}

}
