package com.tcs.ilp;

class Employee{
	int id;
	String name;
	String designation;
	static int ssnNo=0;
	int age;
	double salary;
	Employee(int a,String b,String c,int d,double e)
	{
		id=a;
		name=b;
		designation=c;
		age=d;
		salary=e;
		ssnNo++;
	}
	public static int getSsnNoCounter()
	{
		return ssnNo;
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1= new Employee(28,"bawczld","rpiphga",24,218.0);
		System.out.println("Value of ssnNoCounter : " + Employee.getSsnNoCounter());
		Employee employee2= new Employee(28,"sjfyirr","wsexoca",70,493.0);
		System.out.println("Value of ssnNoCounter : " + Employee.getSsnNoCounter());
		Employee employee3= new Employee(69,"xxtvzeg","vhrnoxk",68,388.0);
		System.out.println("Value of ssnNoCounter : " + Employee.getSsnNoCounter());
		Employee employee4= new Employee(27,"luydzvs","husrfkh",95,887.0);
		System.out.println("Value of ssnNoCounter : " + Employee.getSsnNoCounter());
		Employee employee5= new Employee(33,"ozduycg","wjxzjzz",67,552.0);
		System.out.println("Value of ssnNoCounter : " + Employee.getSsnNoCounter());

	}

}
