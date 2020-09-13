package exerceise_java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exer20 {

	public static void main(String[] args) {
		// 37. Write a Java program to reverse a string. Go to the editor
		//Input Data:The quick brown fox
	
		String S = "The quick brown fox";
		
		 System.out.println("The reversed string is "+ S);
		
		int len = S.length();
		
		System.out.println("The length of the string is " + len);
		
		String rev = "";
		
		
         for ( int i=len-1; i>=0; i--)
        	 
         {
        	 
        	rev = rev + S.charAt(i);
         }
         
         System.out.println("The reversed string is "+ rev);
}


}