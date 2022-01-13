package ders3;

import java.util.Scanner;

public class sinifatlama {

	public static void main(String[] args) {
		int riya,azdili,ing,fizka,kimya;
		double orta=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("riyaziyyatdan balinizi girin");
		riya=scan.nextInt();
		System.out.print("Azerbaycan dilinden  balinizi girin");
		azdili=scan.nextInt();
		System.out.print("ingilis dilinden balinizi girin");
		ing=scan.nextInt();
		System.out.print("Fizikadan balinizi girin");
		fizka=scan.nextInt();
		System.out.print("Kimyadan balinizi girin");
		kimya=scan.nextInt();
		orta=(riya+azdili+ing+fizka+kimya)/5;
		if(orta<50) {
			System.out.print("Kece bilmediniz");
		}else {
			System.out.print("Tebrikler kecdiniz");
		}
		System.out.print("ortalamaniz" + orta);
	}

}
