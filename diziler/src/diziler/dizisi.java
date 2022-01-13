package diziler;

public class dizisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list=new int[4];
		list[0]=1;
		list[1]=2;
		list[2]=3;
		list[3]=4;
		for(int i=0;i<list.length;i++) {
			int value=list[i];
			System.out.println(list[i]);
		}
		System.out.println("-------------");
		for(int value:list) {
			System.out.println(value);
		}
	}

}
