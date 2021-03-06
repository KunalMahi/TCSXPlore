package com.tcs.ilp;

class Emp5{
	private int id;
	private String name;
	private String designation;
	private int age;
	private double salary;
	private int ssnNo;
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
	public int getSsnNo() {
		return ssnNo;
	}
	public void setSsnNo(int ssnNo) {
		this.ssnNo = ssnNo;
	}
	public Emp5(int id, String name, String designation, int age, int ssnNo,double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.salary = salary;
		this.ssnNo = ssnNo;
	}
	
}
public class EmployeeDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp5 employee= new Emp5(22,"xaegzyg","rpeysly",9,85,618.0);
		Emp5 employee1= new Emp5(91,"ghgdjwr","hwtfsrs",71,66,488.0);
		Emp5 employeeres= findMinEmployeeForId(employee,employee1);
		System.out.println(employeeres.getId());

	}
	public static Emp5 findMinEmployeeForId(Emp5 e1,Emp5 e2) {
		if(e1.getId()<=e2.getId())
			return e1;
		return e2;
	}
	
}
