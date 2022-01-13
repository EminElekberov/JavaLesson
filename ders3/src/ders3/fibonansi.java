package ders3;

import java.util.Scanner;

public class fibonansi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("bir sayi girin");
		int input=scan.nextInt();
		int s1=0;
		int s2=1;
		int topla;
		for(int i=1;i<=input;i++) {
			System.out.print(s1+ ",");
			topla=s1+s2;
			s1=s2;
			s2=topla;
		}
	}

}
