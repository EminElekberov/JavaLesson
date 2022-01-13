package collection;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList country=new ArrayList();
		country.add("ankara");
		country.add("baki");
		country.add("moskva");
		country.add("ankara");
		country.add(0,"istanbul");
		country.forEach(i->System.out.println(i));*/
		
		
		ArrayList country=new ArrayList();
		country.add("ankara");
		country.add("baki");
		country.add("moskva");
		country.add("ankara");
		country.add(0,"istanbul");
		Iterator itr=country.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
