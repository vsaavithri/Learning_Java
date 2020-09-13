package training_Java;

public class Creating_Arrays {

	public static void main(String[] args) {
		// creating Arrays
		
	 String [] months = {"mon", "Jan", "feb","mar","apr","may","June","July","aug","Sep","oct", "Nov","Dec"};
	 
	for (int i =1; i<months.length;i++)
		
	{		 
		  if (months[i] == "feb" )
	
	      {
				
		    System.out.println("This is the "+ i + "nd month " + months[i]);		
	       }		
				
		  else	
			  
			  
			  if (months[i] == "mar" )
					
		      {
					
			    System.out.println("This is the "+ i + "rd month " + months[i]);		
		       }		
					
			  else	
				    
			  
			  
	     System.out.println("This is the "+ i + "th month " + months[i]);	

	    }

	System.out.println("Wishing you a very Happy Year 2019, Rock your programming skills by Swami's Grace!!!");
                                         
	}

}