package oop;

public class book {
/*1public String name,author,publisher;
private int numberofpage;
book (int numberofpage,String name,String author,String publisher){
	this.name=name;
	this.author=author;
	this.publisher=publisher;
	if(numberofpage<1) {
		this.numberofpage=10;
		
	}else {
		this.numberofpage=numberofpage;
	}
}
public void pagesize() {
	System.out.println(numberofpage);
}*/
	
	public String name,author,publisher;
	private int numberofpage;
	book (String name,int numberofpage,String author,String publisher){
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		if(numberofpage<1) {
			this.numberofpage=10;
			
		}else {
			this.numberofpage=numberofpage;
		}
	}
	public int getnumberofpage() {
		return this.numberofpage;
	}
	public void setnumber(int size) {
		if(size<1) {
			System.out.println("sehife menfi ola bilmez!!");
			this.numberofpage=10;
		}else {
			this.numberofpage=size;
		}
	}
	public String getname() {
		return this.name;
	}
	public void setname() {
		this.name=name;
	}
}
