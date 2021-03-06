package com.tcs.ilp;

public class AccountDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1= new Account(20,"fvmirje",552.0,90);
		Account account2= new Account(40,"sfvwspp",385.0,66);
		Account account3= new Account(16,"tfypcof",807.0,13);
		Account account4= new Account(15,"gvkhywb",627.0,51);
		Account account5= new Account(29,"iglclrn",775.0,43);


		Account[] objArray= {account1,account2,account3,account4,account5};

		Account[] objArrayRes= sortAccountByAcType(objArray);
		System.out.println("Displaying contents of array: ");

		for(Account account:objArrayRes){
		System.out.println(account.getNumber()+" " + account.getAcType()+" " + account.getBalance()+" " + account.getNoOfAccountHolders()+" ");
		
		}
	}
	public static Account[] sortAccountByAcType(Account[] objArr)
	{
		for(int i=0;i<objArr.length;i++)
		{
			for(int j=i+1;j<objArr.length;j++)
			{
				if(objArr[j].getAcType().compareTo(objArr[i].getAcType())<0)
				{
					Account temp=objArr[i];
					objArr[i]=objArr[j];
					objArr[j]=temp;
				}
			}
		}
		return objArr;
	}

}
