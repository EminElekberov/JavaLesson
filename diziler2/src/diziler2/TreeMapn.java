package diziler2;
import java.util.*;
public class TreeMapn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap ogr=new TreeMap();
		ogr.put(90,"eli");
		ogr.put(19,"emin");
		ogr.put(30,"rasim");
		Set set=ogr.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext()) {
			Map.Entry item=(Map.Entry) i.next();
			System.out.println(item.getKey()+" => "+ item.getValue());
		}
	}

}
