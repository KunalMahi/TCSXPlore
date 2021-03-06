package com.tcs.ilp;

public class EmployeeDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp6 employee= new Emp6(42,"lkvlouk","kaaoxjy",95,45,159.0);
		Emp6 employee1= new Emp6(5,"iqznbbu","nniueao",17,41,816.0);
		Emp6 employeeres= findSecondLargestEmployeeForId(employee,employee1);
		System.out.println(employeeres.getId());

	}
	public static Emp6 findSecondLargestEmployeeForId(Emp6 e1,Emp6 e2) {
		if(e1.getId()<e2.getId())
			return e1;
		return e2;
	}
}
