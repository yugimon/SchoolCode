//© A+ Computer Science  -  www.apluscompsci.com

public class Aplus14FibonacciRunner
{
	public static void main(String args[])
	{
		//add test cases
		Aplus14Fibonacci q = new Aplus14Fibonacci(50);
		//q.set(50);
		q.get(1);
		System.out.println(q.toString());
		q.get(2);
		System.out.println(q.toString());
		q.get(3);
		System.out.println(q.toString());
		q.get(4);
		System.out.println(q.toString());
		q.get(5);
		System.out.println(q.toString());
		q.get(6);
		System.out.println(q.toString());
		q.get(11);
		System.out.println(q.toString());
		q.get(16);
		System.out.println(q.toString());
		q.get(21);
		System.out.println(q.toString());
		q.get(31);
		System.out.println(q.toString());
		q.get(41);
		System.out.println(q.toString());
		q.get(46);
		System.out.println(q.toString());
		
		q.set(1);
		q.get(1);
		System.out.println(q.toString());
		
		q.set(2);
		q.get(1);
		System.out.println(q.toString());
		q.get(2);
		System.out.println(q.toString());
		q.get(11);
		System.out.println(q.toString());
		
	}
}
