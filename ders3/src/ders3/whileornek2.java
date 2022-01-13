package ders3;

import java.util.Scanner;

public class whileornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.println("sayinizi girn");
		int f=scan.nextInt();
		int sonuc=1;
		while(f>0) {
			sonuc*=f;
			f--;
		}
		System.out.println(sonuc);*/
		
		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("sayinizi girn");
//		double h=scan.nextDouble();
//		double harmonic=0.0;
//		while(h>0) {
//			harmonic+=1/h;
//			h--;
//		}
//		System.out.println(harmonic);
//		
		
	    Scanner scan=new Scanner(System.in);
		System.out.println("sayinizi girn");
		int star=scan.nextInt();
		int i=1;
		while(i<=star) {
			int k=1;
			while(k<=i) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
		
		
		
		/*Scanner scan=new Scanner(System.in);
		int sayi1,ust,sonuc=1;
		System.out.println("reqemi grin");
		sayi1=scan.nextInt();
		System.out.println("quvveti  grin");
		ust=scan.nextInt();
		int i=1;
		while(i<=ust) {
			sonuc*=sayi1;
			i++;
		}
		System.out.print(sonuc);*/
		
	}

}
