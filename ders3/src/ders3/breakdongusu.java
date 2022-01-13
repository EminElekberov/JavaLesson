package ders3;

import java.util.Scanner;

public class breakdongusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		/*int say;
		while(true) {
			System.out.print("bir reqem girin");
			say=scan.nextInt();
			if(say==0) {
				break;
			}
		}*/
		for(int i=1;i<=9;i++) {
			if(i==4 || i==9) {
				System.out.println("atladi : "+i);
				continue;
				
			}
			System.out.println("i= "+ i);
		}
	}

}
