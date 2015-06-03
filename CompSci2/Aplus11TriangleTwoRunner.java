//© A+ Computer Science  -  www.apluscompsci.com
/*I can take the shape of an animal.
I can take the shape of a plant.
I and my many brothers, together, we take different shapes, to build different shapes, who together build different shapes.
We can take the shape of an animal.
We can take the shape of a plant.
What are we?*/

import java.util.Scanner;
import static java.lang.System.*;

public class Aplus11TriangleTwoRunner
{
   public static void main( String args[] )
   {
   	Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			out.print("Enter the size of the triangle : ");
			int big = keyboard.nextInt();
			out.print("Enter a letter : ");
			String value = keyboard.next();

				//instantiate a Aplus11TriangleTwo object
      Aplus11TriangleTwo tw = new Aplus11TriangleTwo( value, big );
         	//call the toString method to print the triangle 
			System.out.println( tw );

			System.out.print("Do you want to enter more data? ");
			choice=keyboard.next();
		}while(choice.equals("Y")||choice.equals("y"));
	}
}


//A: Cells
