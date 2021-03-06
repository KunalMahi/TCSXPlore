package com.tcs.ilp;

public class AccountDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1= new Account(43,"ianynap",267.0,41);
		Account account2= new Account(80,"gneuwmm",789.0,76);
		Account account3= new Account(80,"yyudure",588.0,99);
		Account account4= new Account(60,"ahixnty",831.0,39);
		Account account5= new Account(72,"iwundhq",804.0,4);


		Account[] objArray= {account1,account2,account3,account4,account5};

		Account[] objResultArray1= searchAccountByAcType(objArray, "oxxvosw");
		if(objResultArray1[0]==null){
		System.out.println("Output after first search is null. ");
		}else{
		System.out.println("Displaying contents of result array: ");

		for(Account account:objResultArray1){
			if(account==null)
				break;
		System.out.println(account.getNumber()+" " + account.getAcType()+" " + account.getBalance()+" " + account.getNoOfAccountHolders()+" ");
		}
		}

		Account[] objResultArray2= searchAccountByAcType(objArray, "gneuwmm");
		if(objResultArray2[0]==null){
		System.out.println("Output after first search is null. ");
		}else{
		System.out.println("Displaying contents of result array: ");

		for(Account account:objResultArray2){
			if(account==null)
				break;
		System.out.println(account.getNumber()+" " + account.getAcType()+" " + account.getBalance()+" " + account.getNoOfAccountHolders()+" ");
		}
		}

	}
	public static Account[] searchAccountByAcType(Account[] arrObj,String name)
	{
		Account res[]=new Account[10];
		int i=0;
		for(int j=0;j<arrObj.length;j++)
		{
			if(arrObj[j].getAcType().equals(name))
			{
				res[i]=arrObj[j];
				i++;
			}
		}
		return res;
	}
}
