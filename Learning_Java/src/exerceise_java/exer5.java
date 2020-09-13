package exerceise_java;

import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		//  Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
		/*
		 * 	Input first number: 125
		Input second number: 24
		Expected Output :
		125 + 24 = 149
		125 - 24 = 101
		125 x 24 = 3000
		125 / 24 = 5
		125 mod 24 = 5

	*/
		
		
		Scanner scan1 = new Scanner(System.in);
				
				System.out.println("Input First Number");
		
		          int num1 = scan1.nextInt();
		          
		          System.out.println("Input second Number");
		          
		          int num2 = scan1.nextInt();
		          
		          //Add two number
		          
		          int num3 = num1+num2;
		          
		          System.out.println("The sum of two number is  " + num3);
		          //Subract two numbers 
		          
		          int num4 = num1-num2;
		          
		          System.out.println("The Diference of two number is  " + num4);
		          
		          //multiply two numbers
		          
		          int num5 = num1* num2;
		          
		          System.out.println("The Multiplication of two number is  " + num5);
		          
		          //Mod of two numbers 
		          
		          int num6 = num1 % num2;
		          
		          System.out.println("The Division of two  number is  " + num6);
		
	}

}
