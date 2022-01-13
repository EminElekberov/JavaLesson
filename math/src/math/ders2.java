package math;

public class ders2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char[] str= {'e','m','i','n'};
		String metin=new String(str);
		System.out.println(metin);*/
		
		
		String metin="emin ekberovv";
		String metin2="elekberov";
		System.out.println(metin.length());
		System.out.println(metin+metin2);
		System.out.println(metin.concat(metin2));
		System.out.println(metin.indexOf('i'));
		System.out.println(metin.charAt(1));
		System.out.println(metin.contains("in"));
		System.out.println(metin.endsWith("in"));
		System.out.println(metin.replace("ekberovv", "elekberovv")); 
		System.out.println(metin.toUpperCase());
	}

}
