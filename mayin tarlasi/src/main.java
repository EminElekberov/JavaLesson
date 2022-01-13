import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int row,column;
		System.out.println("mayin tarlasina hos geldiniz. ");
		System.out.println("boyutlariniz girn ");
		System.out.println("setir sayisi ");
		row=scan.nextInt();
		System.out.println("stun saysii ");
		column=scan.nextInt();
		mayintarlasi mayin=new mayintarlasi(row,column);
		mayin.run();
	}

}
