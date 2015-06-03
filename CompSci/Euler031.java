//73682
public class Euler031
{
	public static void main( String[] args )
	{
		int z=0;
		for( int m1p=0; m1p<=200; m1p++)
			for( int m2p=0; m2p<=200; m2p+=2)
				for( int m5p=0; m5p<=200; m5p+=5)
					for( int m10p=0; m10p<=200; m10p+=10)
						for( int m20p=0; m20p<=200; m20p+=20)
							for( int m50p=0; m50p<=200; m50p+=50)
								for( int e1=0; e1<=200; e1+=100)
									for( int e2=0; e2<=200; e2+=200)
										if(m1p+m2p+m5p+m10p+m20p+m50p+e1+e2==200)
										{
											z++;
										}
											
										System.out.println(z);
		
	}
}