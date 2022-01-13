package diziler2;
import java.util.*;

public class jenerik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		for(Integer obj:a) {
			System.out.println(obj.doubleValue());
		}
		HashMap<Integer,String> c=new HashMap<>();
		c.put(1,"baki");
		c.put(2,"istanbul");
		c.put(5,"america");
		for(Integer key:c.keySet()) {
			System.out.println("key "+ key+"value "+c.get(key));
		}
	}

}
