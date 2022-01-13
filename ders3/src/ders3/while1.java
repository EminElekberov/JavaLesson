package ders3;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i=1;
		while(i<=100) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}*/
		
		
		Scanner scan=new Scanner(System.in);
		int topla=0,input;
		System.out.println("lutfen sayi girin");
		while(true) {
			input=scan.nextInt();
			if(input<0) {
				System.out.println("proqram qurtadi menfi sayi girdiniz ");
				System.out.println("girilen tek reqemlerin cemi: " + topla);
				break;				
			}
			if(input%2==1) {
				topla+=input;
			}
		}
	}

}
