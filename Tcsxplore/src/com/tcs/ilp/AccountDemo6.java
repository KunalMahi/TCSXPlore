package com.tcs.ilp;

public class AccountDemo6 {
	public static void main(String args[]){
		Account account1= new Account(43,"bqhqoho",328.0,1);
		Account account2= new Account(95,"pbuyhuk",931.0,73);
		Account account3= new Account(74,"jkmxefn",34.0,18);
		Account account4= new Account(43,"rnoebjc",799.0,39);
		Account account5= new Account(17,"czwgofn",372.0,15);


		Account[] objArray= {account1,account2,account3,account4,account5};

		Account[] objResultArray1= searchAccountByBalance(objArray, 322.0);
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

		Account[] objResultArray2= searchAccountByBalance(objArray, 372);
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
	public static Account[] searchAccountByBalance(Account[] objArr,double bal) {
		Account[] res=new Account[10];
		int i=0;
		for(Account a:objArr) {
			if(a.getBalance()==bal) {
				res[i++]=a;
			}
		}
		return res;
	}
}
