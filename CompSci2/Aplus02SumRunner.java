//© A+ Computer Science  -  www.apluscompsci.com

public class Aplus02SumRunner
{
	public static void main( String[] args )
	{
		Aplus02Sum test = new Aplus02Sum();
		test.setNums(5,5);
		test.sum();
		test.print();

		test.setNums(90,100.0);
		test.sum();
		test.print();

		//add more test cases
		test.setNums(100.5,85.8);
		test.sum();
		test.print();
		
		test.setNums(-100.0,55.5);
		test.sum();
		test.print();
		
		test.setNums(15236.0,5642.0);
		test.sum();
		test.print();
		
		test.setNums(1000.0,555.0);
		test.sum();
		test.print();
		
	}
}
