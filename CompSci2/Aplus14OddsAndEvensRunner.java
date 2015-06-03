//© A+ Computer Science  -  www.apluscompsci.com


import java.util.Arrays;

public class Aplus14OddsAndEvensRunner
{
	public static void main( String args[] )
	{
	
		int[] one = {2,4,6,8,10,12,14};
		int[] two = {1,2,3,4,5,6,7,8,9};
		int[] three = {2,10,20,21,23,24,40,55,60,61};
		int[] oneOdd = Aplus14OddsAndEvens.getAllOdds(one);
		int[] oneEven = Aplus14OddsAndEvens.getAllEvens(one);
		int[] twoOdd = Aplus14OddsAndEvens.getAllOdds(two);
		int[] twoEven = Aplus14OddsAndEvens.getAllEvens(two);
		int[] threeOdd = Aplus14OddsAndEvens.getAllOdds(three);
		int[] threeEven = Aplus14OddsAndEvens.getAllEvens(three);
		//add test cases
		System.out.println( Arrays.toString(one));
		System.out.println("Odds - " + Arrays.toString(oneOdd));
		System.out.println("Evens - " + Arrays.toString(oneEven));
		System.out.println();
		
		System.out.println( Arrays.toString(two));
		System.out.println("Odds - " + Arrays.toString(twoOdd));
		System.out.println("Evens - " + Arrays.toString(twoEven));
		System.out.println();
		
		System.out.println( Arrays.toString(three));
		System.out.println("Odds - " + Arrays.toString(threeOdd));
		System.out.println("Evens - " + Arrays.toString(threeEven));
		System.out.println();
		
	}
}
