package math;

import java.util.Scanner;

public class ortalama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] notlar=new int[7];
		double sonuc=0;
		int toplam=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen notlarinizi girin");
		System.out.println("riyaziyyat: " );
		notlar[0]=scan.nextInt();
		System.out.println("turkce: " );
		notlar[1]=scan.nextInt();
		System.out.println("fizika: " );
		notlar[2]=scan.nextInt();
		System.out.println("tarix: " );
		notlar[3]=scan.nextInt();
		System.out.println("kimya: " );
		notlar[4]=scan.nextInt();
		System.out.println("idman: " );
		notlar[5]=scan.nextInt();
		System.out.println("musiqi: " );
		notlar[6]=scan.nextInt();
		for(int not:notlar) {
			toplam+=not;
		}
		System.out.println("ortalamaniz: "+ (toplam/notlar.length));
	}

}
