package ders3;

public class polindrom {
	static boolean ispolindrom(int input) {
		int tmp,terssayi=0,qalan;
		tmp=input;
		
		while(tmp !=0) {
			qalan=tmp%10;
			terssayi=terssayi * 10+qalan;
			tmp/=10;
		}
		if(input==terssayi) 
			return true;
		else
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(ispolindrom(123));
	}

}
