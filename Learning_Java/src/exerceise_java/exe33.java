package exerceise_java;

import java.util.Scanner;

public class exe33 {

	public static void main(String[] args) {
		// Write a Java program and compute the sum of the digits of an integer
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the Integer");
		long num = scan2.nextLong();
		
		
			exe33 test1 = new exe33();
			
			test1.sumdigits(num);
			
		}

		
		
	public static  long sumdigits(long num)
	{
	long digit;
	long sum = 0;
	{
		digit = num %10; // 0
		sum = sum+ digit; //0
		digit = num/10; //50
		sum = sum + digit; 
		digit = num/10; //50
		sum = sum + digit; 
		
		
		System.out.println(sum);
		
		
		
		
	}
	
	return sum;
	}

}
