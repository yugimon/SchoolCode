//73682
public class Euler031
{
	public static void main( String[] args )
	{
		int a=0;
		for( int p1=0; p1<=200; p1++)
			for( int p2=0; p2<=200; p2+=2)
				for( int p5=0; p5<=200; p5+=5)
					for( int p10=0; p10<=200; p10+=10)
						for( int p20=0; p20<=200; p20+=20)
							for( int p50=0; p50<=200; p50+=50)
								for( int e1=0; e1<=200; e1+=100)
									for( int e2=0; e2<=200; e2+=200)
										if(p1+p2+p5+p10+p20+p50+e1+e2==200)
											a++;
											
										System.out.println(a);
	}
}