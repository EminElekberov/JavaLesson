package ders3;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String kadi,parola;
		System.out.print("kullanici adini giriniz");
		kadi=scan.nextLine();
		System.out.print("sifrenizni giriniz");
		parola=scan.nextLine();
		if(kadi.equals("java") && parola.equals("123")) {
			System.out.print("basarili");
		}else {
			System.out.print("basarisiz");
		}
	}

}
