package ders3;

import java.util.Scanner;

public class while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int input,topla=0;
		do {
			System.out.println("lutfen sayi girin");
			input=scan.nextInt();
			if(input%2==0) {
				topla+=input;
			}
		}while(input>0);
		System.out.println(topla);
	}

}
