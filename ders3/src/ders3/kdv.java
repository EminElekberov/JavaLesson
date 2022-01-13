package ders3;

import java.util.Scanner;

public class kdv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tutar, kdvqiymet, kdv=0.18;
		Scanner input=new Scanner(System.in);
		System.out.print("urunun tutarini girn ");
		tutar=input.nextDouble();
		kdvqiymet=tutar+(tutar*kdv);
		System.out.print(kdvqiymet);
		
	}

}
