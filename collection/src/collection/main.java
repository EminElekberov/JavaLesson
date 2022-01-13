package collection;
import java.util.*;

public class main {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("12 Str");
		h.add(12);
		h.add(12.0);
		h.add(true);
		h.add(null);
		h.remove("12");//bu silmek ucun istidade olunur
		Iterator itr=h.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
