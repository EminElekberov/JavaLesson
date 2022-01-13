package ders3;

import java.util.Scanner;

public class switchuygulamsi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("sayi girn: ");
		int sayi=scan.nextInt();
		switch(sayi) {
		case 1:
		System.out.print("1 e beraberdir ");
		break;
		case 2:
		System.out.print("2 e beraberdir ");
		break;
		case 3:
		System.out.print("3 e beraberdir ");
		break;
		default:
			System.out.print("gecersiz sayi giridniz ");
		}
	}

}
