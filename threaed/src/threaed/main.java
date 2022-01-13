package threaed;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*islemler i1=new islemler("ilk");
		i1.run();
		
		islemler i2=new islemler("iki");
		i2.run();*/
		
		islemler i1=new islemler("ilk");
		Thread t1=new Thread(i1);
		
		islemler i2=new islemler("iki");
		Thread t2=new Thread(i2);
		t1.start();
		t2.start();
	}

}
