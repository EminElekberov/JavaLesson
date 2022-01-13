package diziler;

import java.util.Scanner;

public class dizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list=new int[4];
		list[0]=1;
		list[1]=2;
		list[2]=3;
		list[3]=4;
		//System.out.print(list[3]);
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		
		int[] list2=new int[4];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<list2.length;i++) {
			list2[i]=scan.nextInt();
		}
		for(int i=0;i<list2.length;i++) {
			System.out.println(list2[i]);
		}
	}

}
