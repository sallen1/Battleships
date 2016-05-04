
import java.util.InputMismatchException;
import java.util.Scanner;

public class Paint2{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//Scanner == the INPUT 

		// Define the width, height and length of the room


		 
		 // Remember to include all while statements under the do statement, and to close it properly. 
		 // Remember to check all curly brackets are being used correctly to close all statements. 
		
		
		 
		
		
		// Conditions for user input - user input must be an integer and greater than 0
		
		
		float xx, xy, xz;
		boolean good = false;
		do
		{
		System.out.println("Please enter the width of the room you are painting in metres cubed:");
		  xx = scan.nextFloat();
		  if(xx > 0 && xx >= 0)
		    good = true;
		  else
		    System.out.println("What part of positive number don't you understand?");
		
		}
		
		while (!good);

		try
		{
		    System.out.println("Please enter the height of the room you are painting in metres cubed: ");
		    //check that the user input is a valid float, i.e. greater than zero
		    xy = scan.nextFloat();
		    if(xy > 0 && xy >= 0)
		      good = true;
		    else
		    	
		    	//tell user to input a valid number greater than zero
		      System.out.println("What part of positive number don't you understand?");
		    
		    	//check that user input is valid format, i.e. acceptable float format variable
		    if(!scan.hasNextFloat())
		    	  good = false;
		          System.out.println("Invalid input!");
			}   catch (InputMismatchException e) {
				System.err.println(e.getMessage()); 
		         
		        		 		        	
		        	  
		        
		          }
		    
	
		
		
		while (!good);
		
		good = false;
		do
		{
		    System.out.println("Please enter the length of the room you are painting in metres cubed: ");
		    xz = scan.nextFloat();
		    if(xz > 0 && xz <= 10000)
		      good = true;
		    else
		      System.out.println("What part of positive number don't you understand?");
		}
		while (!good);
		
	}
}

						
		/**									
						
			// Improve the following condition, potentially use as boolean as a condition for user input 
		
		System.out.println("Please enter the height of the room you are painting in metres cubed:");
		int xy = scan.nextInt();
	
		System.out.println("Please enter the length of the room you are painting in metres cubed:");
		int xz = scan.nextInt();

		System.out.println(("Total Area = " + (xx * xy * xz)));

		// Paint Prices - First Paint

		System.out.println("Please enter the price of the first paint:");
		double a = scan.nextDouble();
		System.out.println("Please enter the volume of the first paint:");
		double b = scan.nextDouble();
		System.out
				.println("Please enter the area the first paint covers per litre:");
		double c = scan.nextDouble();

		double a1 = (b * c / a);

		System.out.println(("Area Covered/£ = " + (a1)));

		// Paint Prices - Second Paint

		System.out.println("Please enter the price of the second paint:");
		double d = scan.nextDouble();
		System.out.println("Please enter the volume of the second paint:");
		double e = scan.nextDouble();
		System.out
				.println("Please enter the area the second paint covers per litre:");
		double f = scan.nextDouble();

		double a2 = (e * f / d);

		System.out.println(("Area Covered/£ = " + (a2)));

		// Paint Prices - Third Paint

		System.out.println("Please enter the price of the third paint:");
		double g = scan.nextDouble();
		System.out.println("Please enter the volume of the third paint:");
		double h = scan.nextDouble();
		System.out
				.println("Please enter the area the third paint covers per litre:");
		double i = scan.nextDouble();

		double a3 = (h * i / g);

		System.out.println(("Area Covered/£ = " + (a3)));

		if ((a1 > a2) && (a1 > a3)) {

			System.out
					.println(("The best value paint is the first paint: " + (a1)));

		}

		else if ((a2 > a1) && (a2 > a3)) {

			System.out
					.println(("The best value paint is the second paint: " + (a2)));

		}

		else if ((a3 > a1) && (a3 > a2)) {

			System.out
					.println(("The best value paint is the third paint: " + (a3)));}
		
					}
	

	}
}

		
		
					
	


	
	
*/