package com.tcs.ilp;

public class AccountDemo7 {
	public static Account[] searchAccountByNoOfAccountHolders(Account[] arrObj, int x)
	{
		Account[] res=new Account[10];
		int i=0;
		for(Account a:arrObj) {
			if(a.getNoOfAccountHolders()==x)
			{
				res[i++]=a;
			}
		}
		return res;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1= new Account(4,"rbwgqps",630.0,33);
		Account account2= new Account(56,"pwibjzs",437.0,53);
		Account account3= new Account(45,"djhipnk",889.0,22);
		Account account4= new Account(35,"jnwtber",980.0,99);
		Account account5= new Account(7,"tyuaktj",66.0,7);


		Account[] objArray= {account1,account2,account3,account4,account5};

		Account[] objResultArray1= searchAccountByNoOfAccountHolders(objArray, 17);
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

		Account[] objResultArray2= searchAccountByNoOfAccountHolders(objArray, 99);
		if(objResultArray2==null){
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

}
