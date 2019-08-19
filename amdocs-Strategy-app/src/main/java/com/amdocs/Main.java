package com.amdocs;

import java.util.Scanner;

public class Main {
	
	public static  int  display()
	{
		   System.out.println("Main Menu");
	       System.out.println("1.Quick Sort-----1");
	       System.out.println("1.Bubble Sort-----2");
	       System.out.println("1.Heap Sort-----3");
	       System.out.println("1.Exit-----4");   
		   System.out.println("Enter Choice:");
		   Scanner sc11=new Scanner(System.in);
		    return sc11.nextInt();
	}
	
	public static void dowork(int ch)
	{
		IAlgorithm alg=AlgorithmFactory.getAlgorithm(ch);
		alg.sort();
	}

	public static void main(String[] args) {
        
       int ch=0;
       while(ch!=4)
       {
    	   ch=display();
    	   if(ch!=4)dowork(ch);
    	   
       }
       System.out.println("Thanks");
	}

}
