package oyun;

import java.util.Scanner;

public class Game {
	Player player;
	Location location;
	Scanner scan=new Scanner(System.in);
	public void login() {
		Scanner scan=new Scanner(System.in);
		System.out.println("xos geldiniz.");
		System.out.println("adinizi girin.");
		//String playername=scan.nextLine();
		player=new Player("a");
		player.selectCha();
		start();
	}
	public void start() {
		while(true) {
			System.out.println();
			System.out.println("=========================================");
			System.out.println();
			System.out.println("bir yer secin.");
			System.out.println("1. Guvenli ev-->size aid guvenli bir ev dusman yoxdur!!");
			System.out.println("2. Magara-->qarsiniza belke zombi cixa biler ehtiyatli olun.");
			System.out.println("3. Orman-->qarsiniza belke vampir cixa biler ehtiyatli olun.");
			System.out.println("4. Nehir-->qarsiniza belke ayi cixa biler ehtiyatli olun.");
			System.out.println("5. Magaza-->silah ve zirh ala bilersiniz.");
			System.out.print("getmek isdediyiniz yeri aecin: ");
			int selLoc=scan.nextInt();
			while(selLoc<0 || selLoc>5) {
				System.out.println("lutfen gecerli bir sayi girin!");
				selLoc=scan.nextInt();
			}
			switch(selLoc) {
			case 1:
				location=new SafeHouse(player);
				break;
			case 2:
				location=new Cave(player);
				break;
			case 3:
				location=new Forest(player);
				break;
			case 4:
				location=new River(player);
				break;
			case 5:
				location=new ToolStore(player);
				break;
				default:
					location=new SafeHouse(player);
			}
			if(location.getClass().getName().equals("SafeHouse")) {
				if(player.getInv().isFirewood() && player.getInv().isFood() && player.getInv().isWater()) {
					System.out.print("tebrikler oyunu qazandiniz");
					break;
				}
			}
			if(!location.getLocation()) {
				System.out.println("oyun qurtardi,");
				break;
			}
		}
	}
}
