package com.tcs.ilp;

public class AccountDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1= new Account(79,"dxqfkje",750.0,32);
		Account account2= new Account(70,"yzfsutw",759.0,42);
		Account account3= new Account(24,"iqqlcfr",966.0,85);
		Account account4= new Account(27,"xqaibfl",733.0,75);
		Account account5= new Account(79,"jxpsdpo",324.0,54);


		Account[] objArray= {account1,account2,account3,account4,account5};

		Account[] objArrayRes= sortAccountByNumber(objArray);
		System.out.println("Displaying contents of array: ");

		for(Account account:objArrayRes){
		System.out.println(account.getNumber()+" " + account.getAcType()+" " + account.getBalance()+" " + account.getNoOfAccountHolders()+" ");

		}
	}
	public static Account[] sortAccountByNumber(Account[] objArr)
	{
		for(int i=0;i<objArr.length;i++)
		{
			for(int j=i+1;j<objArr.length;j++)
			{
				if(objArr[j].getNumber()<objArr[i].getNumber())
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
