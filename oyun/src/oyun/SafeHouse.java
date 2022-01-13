package oyun;

public class SafeHouse extends NormalLoc{

	SafeHouse(Player player) {
		super(player,"guvenli ev");
		
	}
public boolean getLocation() {
	player.setHealth(player.getrHealthy());
	System.out.println("yaxsilasdiniz..");
	System.out.println("guvenli ev adli yerdesiniz.");
	
	return true;
}
}
