package collection;
import java.util.*;
public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet tree=new TreeSet();
		 tree.add(10);
		 tree.add(1);
		 tree.add(2);
		 tree.add(6);
		 tree.forEach(item->System.out.println(item+","));
	}

}
