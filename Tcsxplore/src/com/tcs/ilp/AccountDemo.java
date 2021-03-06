package com.tcs.ilp;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1= new Account(7,"ewqkvae",168.0,67);
		Account account2= new Account(3,"mqclvcm",123.0,74);
		Account account3= new Account(57,"uenzjpt",164.0,98);
		Account account4= new Account(28,"hwzlblz",130.0,5);
		Account account5= new Account(4,"rmejckg",125.0,28);
		Account[] objArray= {account1,account2,account3,account4,account5};
		int accountres= searchAccountByNumber(objArray, 63);
		System.out.println("Output after first search: "+accountres);
		int accountres1= searchAccountByNumber(objArray, 4);
		System.out.println("Output after second search: "+accountres1);
	}
	public static int searchAccountByNumber(Account[] objArray,int no) {
		for(int i=0;i<objArray.length;i++) {
			if(objArray[i].getNumber()==no)
			{
				return i;
			}
		}
		return -1;
	}

}
