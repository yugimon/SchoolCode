//© A+ Computer Science  -  www.apluscompsci.com

import static java.lang.System.*;
import java.util.Scanner;

public class Aplus05CharacterAnalyzer
{
	private char theChar;

	public Aplus05CharacterAnalyzer()
	{
		theChar = ' ';
	}

	public Aplus05CharacterAnalyzer(char c)
	{
		theChar = c;
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if ( theChar >= 'A' && theChar <= 'Z' )
			return true;
		return false;
	}

	public boolean isLower( )
	{
		if ( theChar >= 'a' && theChar <= 'z' )
			return true;
		return false;
	}
	
	public boolean isNumber( )
	{
		if (theChar >= '0' && theChar <= '9')
			return true;
		return false;
	}	

	public int getASCII( )
	{
		return theChar;
	}

	public String toString()
	{
		if (isLower())
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		if (isUpper())
			return ""+getChar() + " is a uppercase character. ASCII == " + getASCII() + "\n";
		if(isNumber())
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";
		return " ";
	}
}
