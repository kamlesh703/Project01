package LoopConnd;

import java.util.Scanner;

public class Dividenumberssannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WAP to check numbers is divisible by 4 using scanner class , take the value in store
		
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter the first value");
		    
		     int a=sc.nextInt();
		     System.out.println("Enter the second value");
		     int b=sc.nextInt();
		     
		     for(int i=a; i<=b; i++)
		    	 
		     {
		    	 if (i%4==0)
		    	 {
		    		 System.out.println(i);
		    	 }
		     }
		     
		       
		

	}

}
