package inherits;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*calisan c=new calisan();
		akademisyen a=new akademisyen();
		memur m=new memur();
		System.out.println(akademisyen.giris());
		System.out.println(memur.giris());*/
		
		
		akademisyen a=new akademisyen("emin","emin@gmail.com","0519788378","cenk","hoca","riyaziyyat");
//		System.out.println(a.getAdsoyad());
		
		ogretimuyesi o=new ogretimuyesi("neci","n@gmail.com","054465785","ramin","hoca","kimya","docent");
		System.out.println(o.giris());
		calisan c=new calisan("ragim","emin@gmail.com","0519788378");
		System.out.println(c.giris());;
		
	}

}
