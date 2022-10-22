//Converting Fahrenheit into Celsius
import java.util.*;

class Temperature {

	public void fahrenheitToCensius(double fahrenheit){
		        // calculate celsius temperature
		    	double celsius = (fahrenheit - 32) / 1.8;
		    	// print the celsius temperature
		    	System.out.println("Value of temperature in Celsius:" + celsius);
		    	System.out.println ("\n\n...............................................\n\n");	
	}
	public void celsiusToFahrenheit(double celsius){
        		// calculate fahrenheit temperature
		    	double fahrenheit = (celsius * 1.8) + 32;
		    	// print the fahrenheit temperature
		    	System.out.println("Value of temperature in Fahrenheit:" + celsius);
		    	System.out.println ("\n\n...............................................\n\n");		     	    	   	    		
	}
		
}

class DemoTemperature{
	public static void main(String[] args)
	{
		double fahrenheit, celsius;
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
		
		System.out.println ("What do you want to do: \n1. Fahrenheit to Celsius \n2. Celsius to Fahrenheit \n3. Exit");
		System.out.print ("\n--------------------------------\nEnter your choice : ");
		choice=sc.nextInt();
		
		//Creating Object of class Temperature
		Temperature r = new Temperature();
		//Switch statement
	    switch (choice) {
	    	
        case 1: 
    	    System.out.println ("\n--------------------------------\n:: Fahrenheit to Celsius ::\n___________________________\n");
    	    try {
    	    	System.out.print ("Fahrenheit = ");
    	    	if(!sc.hasNextDouble())
    	    		throw new NumberFormatException();
 				fahrenheit=sc.nextDouble();
 				r.fahrenheitToCensius(fahrenheit);
    	    }
            catch (NumberFormatException e) {
            	System.out.println ("Not a legal floating point number !");
            	sc.next();
            }
        	
        	break;
    	
        case 2: 
        	System.out.println ("\n--------------------------------\n:: Celsius to Fahrenheit ::\n___________________________\n");
        	try {
        		System.out.print ("Celsius = ");
    	    	if(!sc.hasNextDouble())
    	    		throw new NumberFormatException();
	 			celsius=sc.nextDouble();
	 			r.celsiusToFahrenheit(celsius);
	 			
        	}	
		    	
            catch (NumberFormatException e) {
            	System.out.println ("\nNot a legal floating point number !\n");
            	sc.next();
                }
        	
        	break;
        	
        case 3:
        	System.out.println ("Exit");
    	    break;
        default :
            	System.out.println ("Oops! You hava selected out of the box...");
        	break;
        }
		}while(choice!=3);
		
	}
	
}