package exerceise_java;

public class Exer16 {

	public static void main(String[] args) {
		// T16. Write a Java program to print a face.
		
		//method 1
		
		
		
		/*
		 * 
		 *********
		 [| o o |]                                                
          |  ^  |                                                 
          | '-' |                                                 
          +-----+
		
		 		 
		 */
		
		//Method1 -
		System.out.println("Method1 using println");
		System.out.println("********");
				System.out.println("[|o o|]");
		System.out.println("|  ^  |");
		System.out.println("  '-'  ");
		System.out.println("+------+");
		
		
		
		//Method 2
		System.out.println("Method2 using Arrays");
		
		String[] myface = new String[5];
		
		myface[0] = "********";
		myface[1] = "[|o o|]";
		myface[2] = "|  ^  |";
		myface[3] = "  '-'  ";
		myface[4] = "+------+";
			
		
		for (String i:myface)
		{
			System.out.println(i);
		}
		
		}
		
		
				
		

	}


