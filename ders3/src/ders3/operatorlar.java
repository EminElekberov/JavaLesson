package ders3;

public class operatorlar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		int topla=a+b;
		int cikartma=a-b;
		int vurma=a*b;
		int bolme=a/b;
		int mod=a%b;
		System.out.println("toplami "+ topla);
		System.out.println("cikartma "+ cikartma);
		System.out.println("vurma "+ vurma);
		System.out.println("bolme "+bolme);
		System.out.println("modu "+mod);
		topla++;
		System.out.println(topla);
		
		int sonuc=a++ + b--;
		System.out.println(sonuc);
		
		int sayi1=10;
		int sayi2=5;
		boolean kosu=(sayi1 / sayi2)==2;
		System.out.println("kosu "+ kosu);
		
		boolean kosul1=(sayi1 > sayi2);
		boolean kosul2=(sayi1 > sayi2);
		
		boolean sonuc2=kosul1 && kosul2;
		System.out.println("sonuc "+ sonuc2);
		
		
		sonuc2=kosul1 || kosul2;
		System.out.println("sonuc "+ sonuc2);
		
		String sonuc3=(kosul1) ? "dogru" : "yanlis";
		System.out.println( sonuc3);
		
		sayi1=sayi2;
		System.out.println( sayi1);
		sayi1+=2;
		System.out.println( sayi1);
	}

}
