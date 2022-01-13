package oyun;

public abstract class BattleLoc extends Location{
	protected Obstacle obstacle;
	protected String award;
	BattleLoc(Player player,String name,Obstacle obstacle,String award) {
		super(player);
		this.obstacle=obstacle;
		this.name=name;
		this.award=award;
	}
 public boolean getLocation() {
	 int absCount=obstacle.count();
	 System.out.println("suan "+this.getName());
	 System.out.println("diqqetli ol burda "+absCount+"dene "+obstacle.getName()+" yasiyir!");
	 System.out.print("<S>avas ve ay <K>ac");
	 String selCase=scan.nextLine();
	 selCase=selCase.toUpperCase();
	 if(selCase.equals("S")) {
		 if(combat(absCount)) {
			 System.out.println(this.getName()+" bolgesindeki butun dusmanlari oldurudunuz!");
			 if(this.award.equals("Food") && player.getInv().isFood()==false ) {
				 System.out.println(this.award+" kazandiniz!");
				 player.getInv().setFood(true);
			 }else if(this.award.equals("Water") && player.getInv().isWater()==false ) {
				 System.out.println(this.award+" kazandiniz!");
				 player.getInv().setWater(true);
			 }else if(this.award.equals("Firewood") && player.getInv().isFirewood()==false ) {
				 System.out.println(this.award+" kazandiniz!");
				 player.getInv().setFirewood(true);
			 }
			 return true;
		 }if(player.getrHealthy()<=0) {
			 System.out.println("oldunuz.");
			 return false;
		 }
	 }
	 return true;
 }
 public boolean combat(int absCount) {
	 for(int i=0;i<absCount;i++) {
		 int defObsHealth=obstacle.getHealth();
		 playerStats();
		 enenmyStats();
		 while(player.getrHealthy()>0 && obstacle.getHealth()>0) {
			 System.out.print("<V>ur veya <K>ac");
			 String selCase=scan.nextLine();
			 selCase=selCase.toUpperCase();
			 if(selCase.equals("V")) {
				 System.out.println("siz vurdunuz.");
				 obstacle.setHealth(obstacle.getHealth()-player.getTotalDamage());
				 afterHit();
				 if(obstacle.getHealth()>0) {
					 System.out.println();
					 System.out.println("canavar size vurdu.");
					 player.setrHealthy(player.getrHealthy()-(obstacle.getDamage()-player.getInv().getArmor()));
					 afterHit(); 
				 }
			 }else {
				 return false;
			 }
		 }
		 if(obstacle.getHealth()<player.getrHealthy()) {
			 System.out.println(" dusmanlari uddunuz.");
			 player.setMoney(player.getMoney()+obstacle.getAward());
			 System.out.println("guncel paraniz: "+player.getMoney());
			 obstacle.setHealth(defObsHealth);
		 }else {
			 return false;
		 }
		 System.out.println("-----------------------");
	 }
	 return true;
 }
 public void playerStats() {
	 System.out.println("oyuncu degerleri\n ------------");
	 System.out.println("can: "+player.getrHealthy());
	 System.out.println("hasar: "+player.getTotalDamage());
	 System.out.println("pul: "+player.getMoney());
	 if(player.getInv().getDamage()>0) {
		 System.out.println("silah: "+player.getInv().getwName());
	 }if(player.getInv().getArmor()>0) {
		 System.out.println("zirh: "+player.getInv().getaName());
	 }
 }
 public void enenmyStats() {
	 System.out.println(obstacle.getName()+" degerler\n-------------");
	 System.out.println("can: "+obstacle.getHealth());
	 System.out.println("hasar: "+obstacle.getDamage());
	 System.out.println("odul: "+obstacle.getAward());
 }
 public void afterHit() {
	 System.out.println("oyuncu cani: "+player.getrHealthy());
	 System.out.println(obstacle.getName()+" cani: "+obstacle.getHealth());
	 System.out.println();
 }
}
