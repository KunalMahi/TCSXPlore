package com.tcs.ilp;

class Emp3{
	private int id;
	private String name;
	private String designation;
	private int ssnNo;
	private int age;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSsnNo() {
		return ssnNo;
	}
	public void setSsnNo(int ssnNo) {
		this.ssnNo = ssnNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	Emp3(int a,String b,String c,int d,int e,double f){
		id=a;
		name=b;
		designation=c;
		ssnNo=d;
		age=e;
		salary=f;
	}
}
public class EmployeeDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp3 employee= new Emp3(63,"vysycfx","idfewcd",53,84,330.0);
		Emp3 employee1= new Emp3(9,"vycjbjx","zfmougn",31,53,792.0);
		double employeeres= findAvgEmployeeForId(employee,employee1);
		System.out.println(employeeres);
	}
	public static double findAvgEmployeeForId(Emp3 e1,Emp3 e2) {
		double x=(e1.getId()+e2.getId())/2.0;
		return x;
	}

}
