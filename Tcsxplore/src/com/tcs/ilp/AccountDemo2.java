package com.tcs.ilp;

public class AccountDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1= new Account(33,"atyyfrx",526.0,29);
		Account account2= new Account(73,"niyrmyr",838.0,81);
		Account account3= new Account(86,"tjhyvix",59.0,3);
		Account account4= new Account(53,"xtkrhmr",97.0,63);
		Account account5= new Account(97,"bebjwuk",230.0,26);


		Account[] objArray= {account1,account2,account3,account4,account5};
		Account accountRes1= new Account(31,"mcxdkjh",701.0,64);

		boolean result= replaceAccountByNumber(objArray, accountRes1);
		System.out.println("Output for performing replace on accountRes1 is: "+ result  );          

		System.out.println("Displaying contents of array: ");

		for(Account account:objArray){
		System.out.println(account.getNumber()+" " + account.getAcType()+" " + account.getBalance()+" " + account.getNoOfAccountHolders()+" ");
		}
		System.out.println();

		Account accountRes2= new Account(73,"zgcerte",224.0,29);
		result= replaceAccountByNumber(objArray, accountRes2);

		System.out.println("Output for performing replace on accountRes2 is: "+ result  );          

		System.out.println("Displaying contents of array: ");

		for(Account account:objArray){
		System.out.println(account.getNumber()+" " + account.getAcType()+" " + account.getBalance()+" " + account.getNoOfAccountHolders()+" ");
		}

	}
	public static boolean replaceAccountByNumber(Account[] objArray,Account a) {
		for(int i=0;i<objArray.length;i++) {
			if(objArray[i].getNumber()==a.getNumber()) {
				/*objArray[i].setAcType(a.getAcType());
				objArray[i].setBalance(a.getBalance());
				objArray[i].setNoOfAccountHolders(a.getNoOfAccountHolders());
				objArray[i].setNumber(a.getNumber());*/
				objArray[i]=a;
				return true;
			}
		}
		return false;
	}
}
