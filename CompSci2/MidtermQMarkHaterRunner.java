import static java.lang.System.*;

public class MidtermQMarkHaterRunner
{
	public static void main( String[] args )
	{
		MidtermQMarkHater mark = new MidtermQMarkHater();
		System.out.println(mark.findQuestionMark( "dogsand?cats" ));
		System.out.println(mark.removeQuestionMark( "dogsand?cats" ));
		
		MidtermQMarkHater q = new MidtermQMarkHater();
		System.out.println(q.findQuestionMark( "?woweeistheword" ));
		System.out.println(q.removeQuestionMark( "?woweeistheword" ));
	}
}