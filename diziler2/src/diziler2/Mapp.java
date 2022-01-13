package diziler2;
import java.util.*;
public class Mapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap b=new HashMap();
		b.put("turkiye","ankara");
		b.put("baki","azerbaycan");
		b.put("ingiltere","londra");
		Set s=b.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry item=(Map.Entry) i.next();
			System.out.println(item.getKey()+" => "+ item.getValue());
		}
	}

}
