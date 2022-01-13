package ders3;

import java.util.Scanner;

public class teyyarebieti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int km,tip,yas;
		System.out.print("mesafeni girin");
		km=scan.nextInt();
		System.out.print("\nyasi girin");
		yas=scan.nextInt();
		System.out.print("\ntipi girin (1-tek gedis 2-gedis/gelis)");
		tip=scan.nextInt();
		double yasendirimi,normalqiymet,tipindirimi;
		if(km>0 && yas>0 && (tip==1 || tip==2)) {
			normalqiymet=km*0.10;
			if(yas<12) {
				yasendirimi=normalqiymet*0.5;
			}else if(yas>12 && yas<24) {
				yasendirimi=normalqiymet*0.10;
			}else if(yas>55) {
				yasendirimi=normalqiymet*0.30;
			}else {
				yasendirimi=0;
			}
			normalqiymet-=yasendirimi;
			if(tip==2) {
				tipindirimi=normalqiymet*0.20;
				normalqiymet=(normalqiymet-tipindirimi)*2;
			}
			System.out.print("\nBilet tutari: "+normalqiymet+" $");
		}else {
			System.out.print("girdiyiniz melumatlar yanlisdir ");
		}
		
	}

}
