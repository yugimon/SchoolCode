//© A+ Computer Science  -  www.apluscompsci.com

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Aplus16ArrayListFunHouse
{
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> vr;
		vr = new ArrayList<Integer>();
        int fn = 2;

        while(fn < number){
            if(number % fn == 0){
                vr.add(fn);
            }
            fn++;
        }
		return vr;
	}
	
	public static void keepOnlyCompositeNumbers( List<Integer> nums )
	{
		
		for(int q=0; q < nums.size() ; q++){
			int c =0;
			int fn = 2;
			while( fn < nums.get(q)){
				if(nums.get(q) % fn == 0){
					c++;
				}
				fn++;
			}
			if (c<1)
				nums.remove(q);
		}
	}
}