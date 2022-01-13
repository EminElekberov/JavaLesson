package collection;
import java.util.*;
public class linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet gunler=new LinkedHashSet();
		gunler.add("bazarertesi");
		gunler.add("cume");
		gunler.add("cersenme");
		gunler.add("cersenbe axsami");
		gunler.add("senbe");
		gunler.add("cume axsami");
		
		gunler.add("bazarertesi");
		gunler.forEach(item->System.out.println(item+","));
	}

}
