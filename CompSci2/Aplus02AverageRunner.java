//© A+ Computer Science  -  www.apluscompsci.com

public class Aplus02AverageRunner
{
	public static void main( String[] args )
   {
		Aplus02Average test = new Aplus02Average();
		test.setNums(5,5);
		test.average();
		test.print();
		
 		//add more test cases
		
		test.setNums(90,100.0);
		test.average();
		test.print();
		
		test.setNums(100,85.8);
		test.average();
		test.print();
		
		test.setNums(-100,55);
		test.average();
		test.print();
		
		test.setNums(15236,5642);
		test.average();
		test.print();
		
		test.setNums(1000,555);
		test.average();
		test.print();
	}
}
