package ders3;

public class sayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*hesabmakinesii makine1=new hesabmakinesii();
		makine1.sayi1=10;
		makine1.sayi2=20;
		System.out.println(makine1.sayi1);
		
		hesabmakinesii makine2=new hesabmakinesii();
		makine2.sayi1=20;
		System.out.println(makine2.sayi1);*/
		
		
		/*hesabmakinesii makine1=new hesabmakinesii(1,3);
		System.out.println(makine1.sayi1 + "-"+makine1.sayi2);
		makine1.sayi1=5;
		System.out.print(makine1.sayi1 + "-"+makine1.sayi2);*/
		
		
		hesabmakinesii m1=new hesabmakinesii(10,5,"siyah");
		System.out.println(m1.toplam());
		System.out.println(m1.cixma());
		
		hesabmakinesii m2=new hesabmakinesii(20,3,"mavi");
		System.out.print(m2.toplam());
	}

}
