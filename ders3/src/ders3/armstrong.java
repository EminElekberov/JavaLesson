package ders3;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int birlik,yuzluk,onluq,toplam,temp;
		for(int i=100;i<=999;i++) {
			temp=i;
			birlik=temp%10;
			temp/=10;
			
			onluq=temp%10;
			temp/=10;
			
			yuzluk=temp%10;
			temp/=10;
			toplam=(birlik*birlik*birlik)+(yuzluk*yuzluk*yuzluk)+(onluq*onluq*onluq);
			
			if(toplam==i) {
				System.out.println(i+" bu bir armstrong ededdir: ");
			}
		}
	}

}
