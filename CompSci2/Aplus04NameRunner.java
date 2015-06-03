//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;

public class Aplus04NameRunner
{
	public static void main ( String[] args )
	{
		Aplus04Name person = new Aplus04Name("Sally Sparrow");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);

		person.setName("John Smith");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);

		person.setName("Sammy Lammy");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);

		person.setName("Benny Programmer");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);

		person.setName("Sandy Painter");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);
	}
}
