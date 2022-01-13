package diziler2;
import java.util.*;
public class PriorityQueuee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue  q=new PriorityQueue();
		q.add(10);
		q.add(30);
		q.add(80);
		q.add(40);
		q.add(90);
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
