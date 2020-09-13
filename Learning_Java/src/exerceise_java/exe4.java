package exerceise_java;

public class exe4 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 	4. Write a Java program to print the result of the following operations. Go to the editor
			Test Data:
			a. -5 + 8 * 6
			b. (55+9) % 9 
			c. 20 + -3*5 / 8 
			d. 5 + 15 / 3 * 2 - 8 % 3 
			Expected Output :
			43 
			1 
			19 
			13
		
		 */
		
		
	int a = 5;
	int b = 8;
	int c = 6;
	int e = 55;
	int f = 9;
	
	int  m = 20;
	int n = 3;
	int y = 2;
	
	
			

	int d = -(a)+ (b*c);
	
	System.out.println("The first expression output is " + d);
	
	int g = (e+f) % f;
	System.out.println("The second expression ouput is " + g);
	
    int x = m + (-n*a)/b;
	
	System.out.println("The Third Expression output is " +x);

	
		int p = 15;
		
		int q = a+p/n*y -(b%n);
		
		
		System.out.println("The Fourth Expression output is " +q);
		
		
		
		
	}

}
