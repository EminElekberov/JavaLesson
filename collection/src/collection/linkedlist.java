package collection;
import java.util.*;
public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.add("armud");
		list.add("alma");
		list.add("nar");
		
		list.add(1,"qarpiz");
		list.forEach(i->System.out.println(i));
		
	}

}
