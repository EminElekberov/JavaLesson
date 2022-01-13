package threaed;

public class islemler implements Runnable{
String name;

	public islemler(String name) {

	this.name = name;
	System.out.println(name+"ilk islem olustu");
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			try {
				for(int i=5;i>0;i--) {
					System.out.println(this.name+ " : "+i);
				Thread.sleep(1000);
				}
			} catch (Exception e) {
				System.out.println(this.name+ " hata ile karsilasti ");
			}
			System.out.println(name+"bitti");
	}

}
