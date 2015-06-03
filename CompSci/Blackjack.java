import java.util.Scanner;
class Card
{
	int value;
	String suit;
	String name;
	
	public String toString()
	{
		return name + " of " + suit;
	}
}

public class Blackjack
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to Logan's Blackjack Program!");
		Card[] deck = buildDeck();
		
		//Deal
		int pt;
		int cd1 = (int)(Math.random()*deck.length);
		int cd2 = (int)(Math.random()*deck.length);
		Card pk1 = deck[cd1];
		Card pk2 = deck[cd2];
		pt = pk1.value + pk2.value;
		
		System.out.println("You get a " + pk1 + " and a "+pk2+".");
		System.out.println("Your total is " + pt + ".");
		System.out.println();
		
		int dt;
		int cdA = (int)(Math.random()*deck.length);
		int cdB = (int)(Math.random()*deck.length);
		Card pkA = deck[cdA];
		Card pkB = deck[cdB];
		dt = pkA.value + pkB.value;
		
		System.out.println("The dealer has a " + pkA + " showing, and a hidden card.");
		System.out.println("His total is hidden, too.");
		System.out.println();
		
		//Player Turn
		String pch = "hi";
		System.out.println("Okay, your turn.");
		do
		{
			System.out.println("Do you want to \"hit\" or \"stay\"?");
			pch = kb.next();
			if (pch.equals("hit"))
			{
				int cd3 = (int)(Math.random()*deck.length);
				Card pk3 = deck[cd3];
				System.out.println("You drew a "+pk3+".");
				pt = pt+ pk3.value;
				System.out.println("You total is now "+pt+".");
			}
			if (pt > 21)
			{
				System.out.println("You Bust!");
				pch = "bust";
			}
		} while ((!pch.equals("stay")) && (!pch.equals("bust")));
		
		//Dealers turn
		System.out.println();
		int dch = 0;
		System.out.println("Okay, dealer's turn.");
		System.out.println("His hidden card was a "+pkB+".");
		System.out.println("His total was "+dt+".");
		do
		{
			if (dt <= 16)
			{
				int cdC = (int)(Math.random()*deck.length);
				Card pkC = deck[cdC];
				System.out.println("Dealer chooses to hit.");
				dt = dt + pkC.value;
				System.out.println("He draws a "+pkC+".");
				System.out.println("His total is "+dt+".");
			}
			else if (dt > 21)
			{
				dch = 1;
				System.out.println("The Dealer busts!");
			}
			else 
			{
				System.out.println("The Dealer stays.");
				dch = 1;
			}
			
		}while (dch != 1);
		
		//who wins?
		if ((pt > dt) && (pt <= 21) || (dt > 21)&&(pt <= 21))
			System.out.println("You Win!");
		else
			System.out.println("You Lose!");
			
		
	}
	
	public static Card[] buildDeck()
	{
		String[] suits = { "clubs", "diamonds", "hearts", "spades" };
		String[] names = { "ZERO", "ONE", "two", "three", "four", "five", "six",
			"seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace" };
			
		int i = 0;
		Card[] deck = new Card[52];
		
		for ( String s: suits )
		{
			for ( int v = 2; v <= 14 ; v++ )
			{
				Card c = new Card();
				c.suit = s;
				c.name = names[v];
				if ( v == 14 )
					c.value = 1;
				else if ( v > 10 )
					c.value = 10;
				else
					c.value = v;
					
				deck[i] = c;
				i++;
			}
		}
		shuffleDeck(deck);
		return deck;
	}
	
	
	public static void shuffleDeck( Card[] deck )
	{
		for (int e = 1; e <= 1000 ; e++ )
		{
			int c1 = (int)(Math.random()*51);
			int c2 = (int)(Math.random()*51);
			Card temp = deck[c2];
			deck[c2] = deck[c1];
			deck[c1] = temp;
		}		
	}
}