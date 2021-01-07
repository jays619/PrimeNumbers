package primeNumbers;
import java.util.Scanner;

/**
 * 
 * @author saidJhofiani
 * Date:2/19/16
 * Purpose: report the Users number as a prime or not.
 * 
 */
public class primeNumbers {

	public static void main(String[] args) {
		
	    	boolean result = false;
	    	int response = 0;
	    	Scanner reader = new Scanner(System.in);
	    	
	    	System.out.println("Please enter a number: ");
	    	response = reader.nextInt();
		    
	    	
		while (response < 101)
	    {
	        if (response == 2 || response == 3 || response == 5 || response == 7 
	        		|| response == 11 || response == 13 || response == 17
	        		|| response == 19 || response == 23 || response == 29
	        		|| response == 31 || response == 37 || response == 41
	        		|| response == 53 || response == 59 || response == 61
	        		|| response == 67 || response == 71 || response == 73
	        		|| response == 79 || response == 83 || response == 89 || response == 97)
	        {
	           result = true;
	        }
	        break;
	    }
	    if (result == true)
	    {
	        System.out.println("Yo numba is prime like steak");
	    }
	    else
	    	
	    {
	        System.out.println("Yo numba is not prime bro");
	    }
	}
}


