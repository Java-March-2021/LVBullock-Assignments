
public class FizzBuzz {
	
	public static String fizzBuzz(int number) {
		
        System.out.println("\nLaura Bullock - March 2021 Java Cohort - Fizz Buzz Assignment - March 11, 2021 \n");
		
		//count from 1 to number
		//if we see a number that is
        for(int i = 1; i <= number; i++){
        	
        	//print FIZZ BUZZ if divisible by 3 and 5
            if(i % 3 == 0 && i % 5 == 0){ //order of expressions matter, if this placed last in the code, this will never print because the 2 conditions below will have been met.
                System.out.println("FizzBuzz --> " + i + " is divisible by 3 and 5.");
            }
            
        	//print FIZZ if divisible by 3            
            else if(i % 3 == 0){
            	System.out.println("Fizz --> " + i + " is divisible by 3.");
            }
            
        	//print BUZZ if divisible by 5            
            else if(i % 5 == 0){
            	System.out.println("Buzz --> " + i + " is divisible by 5.");
            }

            //if none of the conditions are true, print this
            else {
            	System.out.println(i);
            }
        }
        return "Nothing to see here.";
	}	
}

