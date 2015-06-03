//© A+ Computer Science  -  www.apluscompsci.com

public class Aplus02LineRunner
{
	public static void main( String[] args )
   {
		Aplus02Line test = new Aplus02Line(1,9,14,2);
		test.calculateSlope();
	 	test.print(); 
		//add test cases	

		
		test.setCoordinates(1,7,18,3);
	 	test.calculateSlope();
	 	test.print(); 
		
		test.setCoordinates(6,4,2,2);
	 	test.calculateSlope();
	 	test.print(); 
		
		test.setCoordinates(4,4,5,3);
	 	test.calculateSlope();
	 	test.print(); 
		
		test.setCoordinates(1,1,2,9);
	 	test.calculateSlope();
	 	test.print();  
	}
}
