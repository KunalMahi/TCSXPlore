package com.tcs.ilp;
class Emp6{
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
	public Emp6(int id, String name, String designation, int ssnNo, int age, double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.ssnNo = ssnNo;
		this.age = age;
		this.salary = salary;
	}
}

public class EmployeeDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp6 employee= new Emp6(37,"ezcpdfq","slkkaxp",64,54,831.0);
		Emp6 employee1= new Emp6(1,"eqtihth","wxazvbb",51,10,295.0);
		Emp6 employee2= new Emp6(43,"iywybtr","iiwjbjs",98,67,421.0);
		Emp6 employeeres= findMinEmployeeForId(employee,employee1,employee2);
		System.out.println(employeeres.getId());

	}
	public static Emp6 findMinEmployeeForId(Emp6 e1,Emp6 e2,Emp6 e3) {
		if(e1.getId()<=e2.getId())
		{
			if(e1.getId()<=e3.getId())
			{
				return e1;
			}
			else return e3;
		}
		if(e2.getId()<e3.getId())
		{
			return e2;
		}
		return e3;
	}
}
