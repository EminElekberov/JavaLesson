package xeta;

public class main {
	public static void main(String[] args) {
		Nonststic n=new Nonststic();
		Nonststic.Inner inner=n.new Inner();
		//inner.run();
		  
		Static.Inner s=new Static.Inner();
		//s.run();
		
		Local l=new Local();
		//l.run();
		
		Anonim a=new Anonim() {
			public void run() {
				System.out.println("anoanim sinifdesiz");
			}
		};
		a.run();
	}
	
}
