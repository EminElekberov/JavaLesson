package math;

public class polindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="qapaq",temp="";
		for(int i=str.length()-1;i>=0;i--) {
			
			temp+=str.charAt(i);
		}
		if(temp.equals(str)) {
			System.out.println("polindromluq: ");
		}
	}

}
