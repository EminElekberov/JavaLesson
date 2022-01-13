package ders3;

public class employee {
	private String name;
	public double salary;
	private int workhours,hireyear;
	employee(int hireyear,int workhours,double salary,String name){
		this.name=name;
		this.salary=salary;
		this.workhours=workhours;
		this.salary=salary;
		
	}
	public double tax() {
		if(this.salary>=1000) {
			return salary*0.03;
		}
		return 0.0;
	}
	public double bonus() {
		int extrahours=this.workhours-40;
		if(extrahours>0) {
			return 30*extrahours;
		}
		return 0.0;
	}
	public double increase() {
		int year=2020-this.hireyear;
		if(year<10) {
			return salary*0.5;
		}else if(year>=10 && year<20) {
			return salary*0.10;
		}else {
			return salary*0.15;
		}
	}
	public void toString(employee emp) {
		System.out.print("tax " + emp.tax()+"\n");
		System.out.print("bonus " + emp.bonus()+"\n");
		System.out.print("increase " + emp.increase()+"\n");
		double totalsalary=emp.salary+emp.tax()+emp.bonus();
		System.out.print("maasiniz: "+ totalsalary+"\n");
		System.out.print("maasiniz: "+ (emp.salary+emp.increase()));
	}
}
