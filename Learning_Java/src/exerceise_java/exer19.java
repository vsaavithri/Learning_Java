package exerceise_java;

import java.util.Scanner;

public class exer19 {

	public static void main(String[] args) {
		// Write a program in Java to input 5 numbers from keyboard and find their sum and average.
		
		int sum = 0;
		Scanner scan1 = new Scanner(System.in);
		
		for ( int i = 1; i<5; i++)
		{
		System.out.println("Enter number"+ i);
		int first = scan1.nextInt();
		sum = sum + first;
		
		}
		System.out.println("The sum of all the five numbers are  "+ sum);
		System.out.println("The Average of al the five numbers are "+sum/5);
		
	}
	
	

}
