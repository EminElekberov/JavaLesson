package ders3;

public class fonksiyon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*f(4);
		System.out.println("ikinci metod");
		f(6);*/
		power(2,3);
		
	}
	static void f(int x) {
		int result=(x+2) *6;
		System.out.println(result);
	}
	static void power(int number1,int number2) {
		int result=1;
		for(int i=1;i<=number2;i++) {
			result*=number1;
		}
		System.out.println("cavab: " + result);
	}
	
}
