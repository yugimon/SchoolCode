//© A+ Computer Science  -  www.apluscompsci.com
// what power did Superman have way before Xray vision?
import static java.lang.System.*;

class Aplus11TriangleWord
{
   private String word;

	public Aplus11TriangleWord()
	{
		word = " ";
	}

	public Aplus11TriangleWord(String w)
	{
		word = w;
	}

	public void setWord(String w)
	{
		word = w;
	}

	public String toString()
	{
		String output="";
		String space = " ";
		for (int j=word.length(), l = 0; j > 0; j--, l++){
			for (int k = j-1; k > 0; k--){
				output += " ";
			}
			
			output += word.substring(l,l+1);
			if (j != word.length()){
				if (l == word.length()-1) {
					for (int m = word.length()-2; m > -1; m--) {
						output += word.substring(m, m+1);
					}
					for (int n = 1; n< word.length()-1; n++) {
						output += word.substring(n,n+1);
					}
					space = "";
				}
				output += space + word.substring(l,l+1) + "\n";
				space += "  ";
			}
			else {
				output += "\n";
			}
			
			
		}
		
		return output+"\n";
	}
}
// Array vision!
