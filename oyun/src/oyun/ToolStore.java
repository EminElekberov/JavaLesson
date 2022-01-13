package oyun;


public class ToolStore extends NormalLoc{

	ToolStore(Player player) { 
		super(player, "magaza");
		
	}
public boolean getLocation() {
	System.out.println("pul: "+ player.getMoney());
	System.out.println("1. silahlar");
	System.out.println("2. zirhlar");
	System.out.println("3. cixis");
	System.out.println("sectiniz: ");
	int selTool=scan.nextInt();
	int selItemId;
	switch(selTool) {
	case 1: 
		selItemId=weaponMenu();
		buyWeapon(selItemId);
	break;
	case 2:
		selItemId=armorMenu();
		buyArmor(selItemId);
	break;
	default:
		break;
	}
	return true;
}
public int armorMenu() {
	System.out.println("1. hafif\t <para:15 - hasar:1>");
	System.out.println("2. orta\t <para:25 - hasar:3>");
	System.out.println("3. agir\t <para:40 - hasar:5>");
	System.out.println("4. cixis");
	System.out.println("silah secin. ");
	int selArmorId=scan.nextInt();
	return selArmorId;
}
public void buyArmor(int itemId) {
	int avoid=0,price=0;
	String aName=null;
	switch(itemId) {
	case 1:
		avoid=1;
		aName="hafif zirh";
		price=15;
		break;
	case 2:
		avoid=5;
		aName="orta zirh";
		price=25;
		break;
	case 3:
		avoid=5;
		aName="agir zirh";
		price=40;
		break;
	case 4:
		System.out.println("cikis edilir");
		break;
		default:
			System.out.println("gecersiz islem.");
			break;
			
	}
	if(price>0) {
		if(player.getMoney()>=price) {
			player.getInv().setArmor(avoid);
			player.getInv().setaName(aName);
			player.setMoney(player.getMoney()-price);
			System.out.println(aName+" satin aldiniz. Engellenen hasar "+player.getInv().getArmor());
			System.out.println("qalan pul "+player.getMoney());
		}else {
			System.out.println("bakiye yetersiz!");
		}
	}
}
public int weaponMenu() {
	System.out.println("1. tabanca\t <para:25 - hasar:2>");
	System.out.println("2. qilinc\t <para:35 - hasar:3>");
	System.out.println("3. tufek\t <para:45 - hasar:7>");
	System.out.println("4. cixis");
	System.out.println("silah secin. ");
	int selWeaponId=scan.nextInt();
	return selWeaponId;
} 
public void buyWeapon(int itemId) {
	int damage=0,price=0;
	String wName=null;
	switch(itemId) {
	case 1:
		damage=2;
		wName="tabanca";
		price=25;
		break;
	case 2:
		damage=3;
		wName="qilinc";
		price=35;
		break;
	case 3:
		damage=7;
		wName="tufek";
		price=45;
		break;
	case 4:
		System.out.println("cikis edilir");
		break;
		default:
			System.out.println("gecersiz islem.");
			break;
			
	}
	if(price>0) {
		if(player.getMoney()>price) {
			player.getInv().setDamage(damage);
			player.getInv().setaName(wName);	
			player.setMoney(player.getMoney()-price);
			System.out.println(wName+" satin aldiniz. Onceki hasar "+player.getDamage()+"yenin hasar "+player.getTotalDamage());
			System.out.println("qalan pul "+player.getMoney());
		}else {
			System.out.println("bakiye yetersiz!");
		}
	}
}
}
