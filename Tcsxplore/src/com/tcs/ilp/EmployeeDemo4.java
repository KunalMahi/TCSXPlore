package com.tcs.ilp;

class Emp4{
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
	Emp4(int a,String b,String c,int d,int e,double f){
		id=a;
		name=b;
		designation=c;
		ssnNo=d;
		age=e;
		salary=f;
	}
}

public class EmployeeDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp4 employee= new Emp4(72,"wcpygay","abmklzn",48,84,196.0);
		Emp4 employee1= new Emp4(67,"vdeynxt","dfzhyvl",62,31,908.0);
		Emp4 employee2= new Emp4(51,"znmmtuu","aoljuyt",0,16,147.0);
		double employeeres= findAvgEmployeeForId(employee,employee1,employee2);
		System.out.println(employeeres);
	}
	public static double findAvgEmployeeForId(Emp4 e1,Emp4 e2,Emp4 e3) {
		double x=(e1.getId()+e2.getId()+e3.getId())/3.0;
		return x;
	}

}
