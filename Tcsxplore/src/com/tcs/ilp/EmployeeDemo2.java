package com.tcs.ilp;

class Employees{
	int id;
	String name;
	String designation;
	int ssnNo;
	int age;
	double salary;
	static int idCounter=0;
	Employees(String a,String b,int c,int d,double e)
	{
		name=a;
		designation=b;
		ssnNo=c;
		age=d;
		salary=e;
		idCounter++;
		id=idCounter;
	}
	public static int getIdCounter()
	{
		return idCounter;
	}
}
public class EmployeeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees employee1= new Employees("jirhehb","siarpha",35,70,776.0);
		System.out.println("Value of idCounter : " + Employees.getIdCounter());
		Employees employee2= new Employees("ycrdzsi","voivkqr",32,87,484.0);
		System.out.println("Value of idCounter : " + Employees.getIdCounter());
		Employees employee3= new Employees("txdxrzv","azpjbbb",4,63,369.0);
		System.out.println("Value of idCounter : " + Employees.getIdCounter());
		Employees employee4= new Employees("pefjukm","mctpbqe",36,0,951.0);
		System.out.println("Value of idCounter : " + Employees.getIdCounter());
		Employees employee5= new Employees("shbrzke","lpcnymz",51,86,181.0);
		System.out.println("Value of idCounter : " + Employees.getIdCounter());


	}

}
