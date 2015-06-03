//© A+ Computer Science  -  www.apluscompsci.com

public class Aplus02CircleRunner
{
	public static void main( String[] args )
   {
		Aplus02Circle test = new Aplus02Circle();
	 	test.setRadius(7.5);
	 	test.calculateArea();
	 	test.print();
		
		//add test cases
		
		test.setRadius(10);
	 	test.calculateArea();
	 	test.print();
		
		test.setRadius(72.534);
	 	test.calculateArea();
	 	test.print();
		
		test.setRadius(55);
	 	test.calculateArea();
	 	test.print();
		
		test.setRadius(101);
	 	test.calculateArea();
	 	test.print();
		
		test.setRadius(99.952);
	 	test.calculateArea();
	 	test.print();
		
	}
}
