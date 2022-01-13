package oyun;

import java.util.Scanner;

public class Player {
private int damage,health,money,rHealthy;
private String name,cname;
private Inventory inv;
Scanner scan=new Scanner(System.in);
public Player(String name) {
	this.name = name;
	this.inv=new Inventory();
}
public void selectCha() {
	switch(chaMenu()) {
	case 1:
		intPlayer("samuray",5,21,15);
		break;
		case 2:
			intPlayer("oxcu",7,18,20);
			break;	
		case 3:
			intPlayer("sovalye",8,24,5);
			break;	
			default:
				intPlayer("samuray",5,21,15);
				break;
	}
	System.out.println("xarakter: "+getCname()+"\thasar"+ getDamage()+"\tsaqliq"+getHealth()+"\tpul"+getMoney());
}
public int chaMenu() {
	System.out.println("lutfen xarakter secin:");
	System.out.println("1 - samuray , hasar:5, sagliq:21, pul:15");
	System.out.println("2 - oxcu , hasar:7, sagliq:18, pul:20");
	System.out.println("3 - sovalye , hasar:8, sagliq:24, pul:5");
	System.out.println("seciminiz: ");
	int chaID=scan.nextInt();
	while(chaID<1 || chaID>3) {
		System.out.print("lutfen gecerli xarakter secin");
		chaID=scan.nextInt();
		
	}
	return chaID;
}
public int getTotalDamage() {
	return this.getDamage()+this.getInv().getDamage();
}
public void intPlayer(String cName,int dmg,int hlthy,int mny) {
	setCname(cName);
	setDamage(dmg);
	setHealth(hlthy);
	setMoney(mny);
	setrHealthy(hlthy);
}

public int getDamage() {
	return damage;
}
public void setDamage(int damage) {
	this.damage = damage;
}
public int getHealth() {
	return health;
}
public void setHealth(int health) {
	this.health = health;
}
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Inventory getInv() {
	return inv;
}
public void setInv(Inventory inv) {
	this.inv = inv;
}
public int getrHealthy() {
	return rHealthy;
}
public void setrHealthy(int rHealthy) {
	this.rHealthy = rHealthy;
}



}
