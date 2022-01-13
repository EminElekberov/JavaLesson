package ders3;

import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bakiye=1000,input,miqdar;
		Scanner scan=new Scanner(System.in);
		System.out.println("banka hos geldiniz");
		System.out.println("guncle bakiyeniz "+ bakiye +"AZN");
		while(bakiye>0) {
			System.out.println();
			System.out.println("1-) pul kocurt");
			System.out.println("2-)pul cixart");
			System.out.println("3-) bakiye sorqula");
			System.out.println("4-) cikis yap");
			System.out.println("etmek isdediyiniz islemi secin");
			input=scan.nextInt();
			
			
			if(input==1) {
				System.out.println("yatirmaq isddiyiiz miqdari secin: ");
				miqdar=scan.nextInt();
				bakiye+=miqdar;
			}else if(input==2) {
				System.out.println("cekmek isdediyiniz miqdar: ");
				miqdar=scan.nextInt();
				if(miqdar>bakiye) {
					System.out.println("yetersiz bakiye ");
				}else {
					bakiye-=miqdar;
				}
			}else if(input==3) {
				System.out.println("guncel bakiyeniz: "+bakiye+ "azn");
				
			}else if(input==4) {
				System.out.println("cixis yapiliyor...");
				break;
			}else {
				System.out.println("gecersiz bir islem girdiniz.");
			}
			
		}
		System.out.println("tekrar bekleriz");
	}

}
