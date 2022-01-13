package ders3;

import java.util.Scanner;

public class artansira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.print("sayilari girn");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		if(a>b &&a>c) {
			if(b>c) {
				System.out.print("a>b>c");
			}else {
				System.out.print("a>c>b");
			}
		}else if(b>c && b>a) {
			if(a>c) {
				System.out.print("b>a>c");
			}else {
				System.out.print("b>c>a");
			}
		}else {
			if(a>b) {
				System.out.print("c>a>b");
			}else {
				System.out.print("c>b>a");
			}
		}
	}

}
