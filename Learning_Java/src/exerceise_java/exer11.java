package exerceise_java;

import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {
		//Write a Java program that takes three numbers as input to calculate and print the average of the numbers
		
		Scanner sc3 = new Scanner(System.in);
		
	       System.out.println("Enter first number ");
	       int num1 = sc3.nextInt();
	    
	    	System.out.println("Enter the second number");
	       int num2 = sc3.nextInt();
	       
	       System.out.println("Enter the Third number");
	       int num3 = sc3.nextInt();
	    		   
	    		   System.out.println("Given the 3 numbers, the average is calculated as "+ ((num1 + num2 + num3)/3));
	    		   
	}

}
