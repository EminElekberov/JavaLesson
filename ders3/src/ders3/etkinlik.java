package ders3;

import java.util.Scanner;

public class etkinlik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int isdilik;
		System.out.print("derceni girin");
		isdilik=scan.nextInt();
		if(isdilik>30) {
			System.out.print("getmek olar");
		}else if(isdilik<=30 && isdilik>=5) {
			System.out.print("getmek olmaz");
		}else {
			System.out.print("evde oturun");
		}
	}

}
