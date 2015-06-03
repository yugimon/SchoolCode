import java.util.*;

public class AnotherFlippingPuzzle
{
	public static void main( String[] args )
	{
		int[][] cubby = new int[4][4];
		int[] code = new int[4];
		
		for(int r=0;r<cubby.length;r++)
		{
			for(int c =0;c<cubby[r].length;c++)
			{
				cubby[r][c] = (int)(Math.random() *2);
				System.out.print(cubby[r][c]);
			}
			System.out.println();
		}
		for(int r=0;r<cubby.length;r++)
		{
			for(int c =0;c<cubby[r].length;c++)
			{
				if(cubby[r][c] == 1)
					code[c] = 0;
				else if(cubby[r][c] == 0)
					code[c] = 1;
				if(cubby[r][c] == 1)
					code[r] = 0;
				else if(cubby[r][c] == 0)
					code[r] = 1;
			}
			
		}
		System.out.println();
		for(int d=0;d<code.length;d++){
			System.out.print(code[d]);
		}
		System.out.println();
	}
}
	
	