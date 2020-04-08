package com.lab1_task1;

import java.util.ArrayList;
import  java.util.Scanner ;

public class Lab1_task1 {
	public static void main(String[] args) {
		/*
		Problem 1
		
		Design	and	implement	an	application	that	reads	an	arbitrary	number	of	integers	that	are	in	the	range	
		0	 to	 50	 inclusive	 and	 counts	 how	many	 occurrences	 of	 each	 are	 entered.	 After	 all	 input	 has	 been	
		processed, print	all	of	the	values	 (with	the	number	of	occurrences)	that	were	entered	one	or	more	
		times. 
		*/

		Scanner input = new Scanner(System.in);
	    int number[] = new int [100];
	    int count[] = new int [100];
	    int temp = 0;

	    System.out.println("Please enter a number between 0 to 50!!!");
	    System.out.println("If you enter enough number please choose --- 0 --- in order to close the code!!!");

	    System.out.print("Enter numbers: ");


	    for (int i = 0; i < number.length; i++) {

	        if ((number [i] = input.nextInt()) <= 50  ) {
	        	if (number [i] == 0) {
		            break;
		        }

	        }else {
	        	System.out.println("It not a number which is asked!!!");
	        }

	    }




	    for (int i = 0; i < number.length; i++) {
	       temp = number [i];
	        count [temp]++;
	    }

	    for (int i = 0; i<count.length; i++) {
	    	System.out.println(count[i]);

	    }

	    for (int i = 1; i < count.length; i++) {
	        if (count [i] > 0 && count [i] == 1) {
	            System.out.printf("%d occurs %d time\n", i, count [i]);
	        }

	        else if(count [i] >= 2){
	            System.out.printf("%d occurs %d times\n", i, count [i]);
	        }
	    }

	}

}