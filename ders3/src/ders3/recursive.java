package ders3;

public class recursive {
	static int f(int x) {
		int toplam=0;
		for (int i=0;i<=1;i++) {
			toplam+=i;
		}
		return toplam;
	}
	static int r(int x) {
		if(x==1) {
			return 1;
		}
		return x + r (x-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(r(10));
	}

}
