package ders3;

public class ifkosullari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50;
		int b=20;
		int c=30;
		/*if(a==b) {
			System.out.print("a ve b sayilari esittir:");
		}
		else {
			System.out.print("a ve b sayilari esit deyil:");
		}
	}*/
		if((a<c) && (a<b)) {
			System.out.print("a en kicikdir");
		}
		else if((c<a) && (c<b)) {
			System.out.print("b en kicikdi");
		}
		else {
			System.out.print("c en kicikdi");
		}
	}
}
