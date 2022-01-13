package ders3;

import java.util.Scanner;

public class asal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int input;
		boolean asal=true;
		do {
			System.out.print("lutfen sayi girn");
			input=scan.nextInt();
		}while(input<2);
		for(int i=2;i<input;i++) {
			if(input%i==0) {
				asal=false;
				break;
			}
		}
		if(asal) {
			System.out.print(" girilen sayi: "+ input + "asaldir");
		}else {
			System.out.print(" girilen sayi: "+input+"asal deyil");
		}
	}

}
