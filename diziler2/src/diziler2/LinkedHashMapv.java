package diziler2;
import java.util.*;
public class LinkedHashMapv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap ogr=new LinkedHashMap();
		ogr.put("eli",90);
		ogr.put("emin",19);
		ogr.put("rasim",30);
		Set set=ogr.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext()) {
			Map.Entry item=(Map.Entry) i.next();
			System.out.println(item.getKey()+" => "+ item.getValue());
		}
	}

}
