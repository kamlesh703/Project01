package LoopConnd;

import java.util.Scanner;

public class PrintevennumbersusingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		//Write a program to print even numbers by using scanner class the value is take in store.
		
		        Scanner sc=new Scanner(System.in);
		        System.out.println("enter the first value");
		        
		        int a=sc.nextInt();
		        System.out.println("enter the second value");
		        int b=sc.nextInt();
		       
		        for(int i=a; i<=b; i++)
		        	
		        {
		        if(i%2==0)
		        {
		        	System.out.println(i);
		        }
		        {
		        	
		        }
		        
		
		        }
		        }
}

