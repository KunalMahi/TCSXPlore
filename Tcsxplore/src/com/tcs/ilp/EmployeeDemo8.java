package com.tcs.ilp;

public class EmployeeDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp6 employee= new Emp6(67,"dsamjrz","suohakp",34,97,806.0);
		Emp6 employee1= new Emp6(99,"qfosoyu","acpnajw",53,59,424.0);
		Emp6 employee2= new Emp6(46,"utftckd","pjgsdnm",55,57,470.0);
		Emp6 employeeres= findSecondLargestEmployeeForId(employee,employee1,employee2);
		System.out.println(employeeres.getId());

	}
	public static Emp6 findSecondLargestEmployeeForId(Emp6 e1,Emp6 e2,Emp6 e3) {
		int x=e1.getId();
		int y=e2.getId();
		int z=e3.getId();
		if(x<y)
		{
			if(x>z)
				return e1;
			if(y<z)
				return e2;
			return e3;
		}
		if(x<z)
			return e1;
		if(y>z)
			return e2;
		return e3;
	}

}
