//© A+ Computer Science  -  www.apluscompsci.com

import java.util.Scanner;

public class Aplus14OddsAndEvens
{
	private static int countEm(int[] array, boolean odd)
	{
		int count = 0;
		for (int i = 0; i < array.length; i++){
			if (array[i]%2 == 0 && odd == false){
				count++;
			}
			else if (array[i]%2 != 0 && odd == true){
				count++;
			}
		}
		return count;
	}
	
	public static int[] getAllEvens(int[] array)
	{
		int eCount = countEm(array,false);
		int k = 0;
		int[] even = new int[eCount];
		for (int i = 0; i < array.length; i++){
			if ( (array[i]%2 == 0 ) && (k < eCount)){
				even[k] = array[i];
				k++;
			}
		}
		return even;
	}

	public static int[] getAllOdds(int[] array)
	{
		int oCount = countEm(array,true);
		int k = 0;
		int[] odd = new int[oCount];
		for (int i = 0; i < array.length; i++){
			if ( (array[i]%2 != 0 ) && (k < oCount)){
				odd[k] = array[i];
				k++;
			}
		}
		return odd;
	}
}
