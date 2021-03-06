package com.tcs.ilp;
import java.util.Scanner;
import java.util.HashMap;

public class Practice {

	
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split(" ",0);
       
        HashMap<String,Integer> h=new  HashMap<String,Integer>();
        System.out.println(str.length);
        for(int i=0;i<str.length;i++){
        	System.out.println(str[i]);
            if(h.get(str[i])==null ) {
                h.put(str[i],1);
            }
            else{
                h.put(str[i],h.get(str[i])+1);
            }
        }
        int f=0;
        for(String i:h.keySet()){
            if(h.get(i)>1){
                f=1;
                System.out.println(i+" "+ h.get(i));
            }
        }
        if(f==0){
            System.out.println("-1");
        }

	}

}
