package exerceise_java;

import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {
		// Write a Java program that takes a number as input and prints its multiplication table upto 10. 
		/*
		 * 
		 * 
		 * 
		 * 
		 */
		
		Scanner s1 = new Scanner(System.in);
				System.out.println("Please enter the number");
		int num = s1.nextInt();
		
		for( int i = 1; i<11; i++)
		{
		
		System.out.println(" number is displayed as " +num +"x" + i +" = " + num*i);
		
		}
	}

}
