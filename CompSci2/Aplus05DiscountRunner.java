//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;
import java.util.Scanner;

public class Aplus05DiscountRunner
{
	public static void main( String args[] )
	{
		out.printf("Original bill amount :: %.0f \n" ,500.0);
		out.printf("Bill after discount:: %.2f \n\n" , Aplus05Discount.getDiscountedBill(500));
		
		out.printf("Original bill amount :: %.0f\n" ,2500.0);
		out.printf("Bill after discount:: %.2f \n\n " ,Aplus05Discount.getDiscountedBill(2500));
		
		out.printf("Original bill amount :: %.0f\n" ,4000.0);
		out.printf("Bill after discount:: %.2f \n\n" ,Aplus05Discount.getDiscountedBill(4000));
		
		out.printf("Original bill amount :: %.0f\n" ,333.33);
		out.printf("Bill after discount:: %.2f\n\n" ,Aplus05Discount.getDiscountedBill(333.33));
		
		
		out.printf("Original bill amount :: %.0f\n" ,95874.2154);
		out.printf("Bill after discount:: %.2f\n\n" ,Aplus05Discount.getDiscountedBill(95874.2154));
		
		
		

	}
}
