package exerceise_java;

import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
		// 5. Write a Java program that takes two numbers as input and display the product of two numbers. b
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the First number");		
		int num1 = scan.nextInt();
		
		System.out.println("Enter the second number");
		int num2 = scan.nextInt();
		
		int num3 = num1 * num2;
		
		System.out.println("The first number is");
		System.out.println(num1);
		
		
		System.out.println("The second number is");
		System.out.println(num2);
	
	
		
		System.out.println("The product of two number is " + num3);

}
}