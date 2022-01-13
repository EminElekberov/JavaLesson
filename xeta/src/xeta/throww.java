package xeta;

public class throww {

	public static void main(String[] args) {
		int a=0;
		if(a==0) {
			System.out.println("bolen 0 ola bilmez");
			throw new ArithmeticException("Exception !");
		}
		System.out.println("kodun devami");
	}
}
