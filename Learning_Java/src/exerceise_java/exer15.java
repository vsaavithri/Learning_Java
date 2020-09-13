package exerceise_java;

import java.util.Scanner;

public class exer15 {

	public static void main(String[] args) {
		// 	15. Write a Java program to swap two variables. 
		
		int t;
		Scanner newscan = new Scanner(System.in);
		 
		 System.out.println(" Enter the first number");
		int  x = newscan.nextInt();
		 System.out.println(" Enter the Second  number");
		int  y = newscan.nextInt();
		 
				 
		System.out.println("x Before ="+ x);
		System.out.println("y Before ="+ y);
		 
		 
		//Swapping.   
		 t =x;
		 x=y;
		 y=t;
		
		 
		 
				 
		
		 
		 
		 System.out.println("x After ="+ x);
		 System.out.println("y After ="+y);
		 
		 
				 
				 
				 


	}

}
