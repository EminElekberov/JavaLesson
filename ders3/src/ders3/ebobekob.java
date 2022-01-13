package ders3;

import java.util.Scanner;

public class ebobekob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int s1,s2,ebob=1,ekob;
		System.out.print("lutfen sayilariniz girin");
		s1=scan.nextInt();
		s2=scan.nextInt();
		int min=(s1<s2) ? s1 : s2;
		for(int i=min;i>0;i--) {
			if((s1%i==0) && (s2%i==0)) {
				ebob=i;
				break;
			}
		}
		ekob=(s1*s2) / ebob;
		System.out.println(s1 + "ve" + s2 + "sayilarinin ebobu" + ebob );
		
		System.out.println(s1 + "ve" + s2 + "sayilarinin ekobu" + ekob );
	}

}
