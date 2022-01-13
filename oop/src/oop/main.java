package oop;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1book b1=new book(400 , "harry potter" , "rowling" , "emin");
		b1.pagesize();*/
		
		book b1=new book("harry potter" , -400 , "rowling" , "emin");
		b1.setnumber(-400);
		System.out.println(b1.getnumberofpage());
	}
}
