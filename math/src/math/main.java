package math;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("online oyrenci: "+student.howstudent());
		student s1=new student("ali",2020,90);
		student s2=new student("ayse",2020,100);
		student s3=new student("mehmet",2000,60);
		System.out.println("online oyrenci: "+student.howstudent());
		s1.exit();
		System.out.println("online oyrenci: "+student.howstudent());
		int[] notlar=new int[3];
		notlar[0]=s1.point;
		notlar[1]=s2.point;
		notlar[2]=s3.point;
		System.out.println(student.calcoverall(notlar));
		
	}

}
