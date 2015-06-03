public class MidtermQMarkHater
{

	public static int findQuestionMark( String word )
	{
		// part A
		int a = word.indexOf("?");
		return a;
	}

	public static String removeQuestionMark(  String word  )
	{
		// part B
		String b = "";
		int a = findQuestionMark(word);
		b += word.substring(0,a);
		b += word.substring(a+1);
		return b;
	}
}
