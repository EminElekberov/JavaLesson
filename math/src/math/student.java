package math;

public class student {
public String name;
public int id,point;
private static int counter;
student (String name,int id,int point){
	this.name=name;
	this.id=id;
	this.point=point;
	student.counter++;
}
public void exit() {
	student.counter--;
}
public static int howstudent() {
	return student.counter;
}
public static double calcoverall(int[] arr) {
	double overall=0;
	for(int i=0;i<arr.length;i++) {
		overall+=arr[i];
		
	}
	return overall/arr.length;
}
}
