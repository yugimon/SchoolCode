//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;
import java.util.Scanner;

public class Aplus05Discount
{
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public static double getDiscountedBill(double bill)
	{
		double to = 0;
		if (bill > 2000)
		{
			to = bill * .15;
			bill = bill - to;
		}
		return bill;
	}
}
