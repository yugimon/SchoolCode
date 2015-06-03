// 4613732

import java.util.*;
import java.math.BigInteger;
import java.math.*;

public class Euler002
{
	public static void main( String[] args )
	{
		BigInteger q = new BigInteger("0");
		BigInteger w = new BigInteger("1");
		BigInteger e = new BigInteger("0");
		BigInteger t = new BigInteger("0");
		BigInteger r = new BigInteger("0");
		BigInteger y = new BigInteger("2");
		for (int z=2;z <= 33;z++)
		{
			e = q.add(w);
			q = w;
			w = e;
			if ( e.remainder(y).equals(r))
			{
				t = t.add(e);
			}
		}
		System.out.println(t);
	
	}
}