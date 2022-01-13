package xeta;

public class tryy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("proqram basladi");
		int a=0;
		try{
			a=2/0;
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		System.out.println(a);
		System.out.println("proqram bitti");*/
		
		int[] arr=new int[3];
		try {
			arr[4]=10;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		System.out.println("proqram bitti.");
	}

}
