package math;

import java.util.Random;
import java.util.Scanner;

public class reqemtexmini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int texmin,can=5,i=0;
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);
		int sayi=rand.nextInt(100);
		boolean oyundurumu=false,hata=false;
		int[] texminler=new int[5];
		System.out.println(sayi);
		System.out.println("Sayi texminine xos geldiniz...");
		System.out.println("0-99 arasinda sayi girin");
		while(can>0) {
			System.out.println("texmininz: ");
			texmin=scan.nextInt();
			texminler[i++]=texmin; 
			if((texmin<0) || (texmin>99)) {
				if(hata) {
					System.out.println("cox fazla htali giris yapdiniz. 1can kaybetdiniz");
					System.out.println("qalan can" + --can);
				}
				    
				else {
					hata=true;
					System.out.println("lutfen 0-99 arasi sayi giriniz");
				}
					
				continue;
			}
			if(texmin==sayi) {
				oyundurumu=true;
				break;
			}else {
				System.out.println("yanlis tekrar deneyin: kalan can "+  --can);
			}
		}
		if(oyundurumu) {
			System.out.println("tebrikler dogrudur");
			System.out.println("sayimiz "+sayi);
			System.out.println("qalan can "+can);
			
		}else {
			System.out.println("basaramadiniz.");
		}
		System.out.print("texminleriniz: ");
		for(int value:texminler) {
			if(value!=0)
			System.out.println(value + ",");
		}
	}

}
