package ders3;

public class riyazi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=5;
		int d=50;
		boolean kosu1= a<b;
		boolean kosu2=d<c;
		boolean sonuc=(kosu1 && kosu2);
		boolean sonuc2=(a<b) && (d>c);
		System.out.print(sonuc);
		System.out.print("\n " +sonuc2);
		
		boolean sonuc3=(kosu1 || kosu2);
		System.out.print("\n " +sonuc3);
	}

}
