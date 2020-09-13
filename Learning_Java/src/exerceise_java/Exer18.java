package exerceise_java;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		// Write a Java program to compare two numbers. Go to the editor
		/*
		 * Input first integer: 25
			Input second integer: 39
		 * 
		 *Input Data:
		 *25 != 39    
		 *25 < 39                                                                           
         25 <= 39                                                                      

			 */
			
		
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Enter the first integer");	
		
		int a = scan1.nextInt();
		System.out.print("Enter the Second integer");
		
				int b = scan1.nextInt();
		
		if(a<b)
			System.out.println(a+ "<" + b);
		
		 if (a!=b)
			System.out.println(a+ "!="+ b);
		
		 if (a<=b)
			System.out.println(a+ " <= "+ b);
		 
		 if ( a==b)
			 System.out.println(a+ " = "+ b);
				
			
		

	}

}
