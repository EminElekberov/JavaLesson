package diziler2;
import java.util.*;
public class queu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new LinkedList();
		q.add("deniz");
		q.add("rehman");
		q.offer("ali");
		q.add("damla");
		System.out.println("remove: - "+q.remove());
		System.out.println("element: - "+q.element());
		q.forEach(i->System.out.println(i));
	}

}
