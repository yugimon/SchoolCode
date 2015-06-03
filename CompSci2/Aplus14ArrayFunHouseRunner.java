//© A+ Computer Science  -  www.apluscompsci.com

import java.util.Arrays;

public class Aplus14ArrayFunHouseRunner
{
	public static void main( String args[] )
	{
		int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};

		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-6  =  " + Aplus14ArrayFunHouse.getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + Aplus14ArrayFunHouse.getSum(one,2,9));
		System.out.println("# of 4s  =  " + Aplus14ArrayFunHouse.getCount(one,4));
		System.out.println("# of 9s  =  " + Aplus14ArrayFunHouse.getCount(one,9));
		System.out.println("# of 7s  =  " + Aplus14ArrayFunHouse.getCount(one,7));
		System.out.println("# new array with all 7s removed = " + Arrays.toString(Aplus14ArrayFunHouse.removeVal(one,7)));
		System.out.println("# of 7s  =  " + Aplus14ArrayFunHouse.getCount(Aplus14ArrayFunHouse.removeVal(one,7),7));
		System.out.println();

		int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};

		//add test cases
		System.out.println(Arrays.toString(two));
		System.out.println("sum of spots 3-16  =  " + Aplus14ArrayFunHouse.getSum(two,3,16));
		System.out.println("sum of spots 2-9  =  " + Aplus14ArrayFunHouse.getSum(two,2,9));
		System.out.println("# of 0s  =  " + Aplus14ArrayFunHouse.getCount(two,0));
		System.out.println("# of 3s  =  " + Aplus14ArrayFunHouse.getCount(two,3));
		System.out.println("# of 7s  =  " + Aplus14ArrayFunHouse.getCount(two,7));
		System.out.println("# new array with all 7s removed = " + Arrays.toString(Aplus14ArrayFunHouse.removeVal(two,7)));
		System.out.println("# of 7s  =  " + Aplus14ArrayFunHouse.getCount(Aplus14ArrayFunHouse.removeVal(two,7),7));
	}
}
