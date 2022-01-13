package ders3;

import java.util.Scanner;

public class hesabmakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sayi1,sayi2,secim;
		System.out.print("ilk sayini girn");
		sayi1=scan.nextInt();
		System.out.print("\nikinci sayini girn");
		sayi2=scan.nextInt();
		System.out.print("\nlutfen isdediyiniz isemi secin");
		System.out.print("1- toplama\n2- cixma\n3- Vurma\n4- Bolme");
		System.out.print("Sectiniz: ");
		secim=scan.nextInt();
		
		if(secim==1) {
			System.out.print("toplama: " +(sayi1+sayi2));
		}else if(secim==2) {
			System.out.print("cixma: " +(sayi1-sayi2));
		}else if(secim==3) {
			System.out.print("vurma: " +(sayi1*sayi2));
		}else if(secim==4) {
			 if(sayi2==0) {
				System.out.print("ikinci sayini 0 eslestir ve sonuc belirsizdir: ");
			}else {
				System.out.print("bolme: " +(sayi1/sayi2));
			}
		}else {
			System.out.print("gecersizx biir islem girdiniz");
		}
	}

}
