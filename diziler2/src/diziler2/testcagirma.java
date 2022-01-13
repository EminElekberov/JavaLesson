package diziler2;
import java.util.*;
public class testcagirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*test<Integer> i=new test<Integer>(15);
		System.out.println(i.getObj());
		
		test<String> s=new test<String>("emoin elekberov");
		System.out.println(s.getObj());*/
		
		/*test2<Integer,String> i=new test2<>(1,"adana");
		i.print();*/
		
		
		
		Integer[] intArr= {1,2,3,4};
		Double[] doubleArr= {1.1,2.1,3.1,4.1};
		Character[] chaArr= {'k','o','d'};
		genericMethod(intArr);
		genericMethod(doubleArr);
		genericMethod(chaArr);
		
		
	}
	
	public static <E> void genericMethod(E[] arr) {
		for(E item:arr) {
			System.out.println(item);
		}
	}

}
