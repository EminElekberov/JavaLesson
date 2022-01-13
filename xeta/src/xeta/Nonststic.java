package xeta;

public class Nonststic {
private int a=10;
public class Inner{
	int a=1;
	public void run() {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(Nonststic.this.a);
	}
}
//public void run() {
//	System.out.println(a);
//	System.out.println(this.a);
//	Inner i=new Inner();
//	System.out.println(i.a);
//}
}
