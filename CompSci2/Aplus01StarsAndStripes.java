//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;

public class Aplus01StarsAndStripes
{
   public Aplus01StarsAndStripes()
   {
      out.println("Aplus01StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
		out.println("********************");
   }

   public void printTwentyDashes()
   {
		out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
		out.println();
		out.println();
   }
   
   public void printASmallBox()
   {	
		printTwentyDashes();
		printTwentyStars();
		printTwentyDashes();
		printTwentyStars();
		printTwentyDashes();
		printTwentyStars();
		printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
		printASmallBox();
		printASmallBox();
   }   
}
