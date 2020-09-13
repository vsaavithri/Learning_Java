package training_Java;

public class Add_two_numbers_using_methods {
	
	int sum;
	
	public int add ( int a, int b)
	
	{
	  sum = a+ b;
	  return sum;
	}
	
	
	

	public static void main(String[] args) {
		// Adding two numbers using methods

		Add_two_numbers_using_methods  at = new Add_two_numbers_using_methods();
				
				System.out.println("The addition of two number is  "+ at.add(54,56));
				
				
	}

}
