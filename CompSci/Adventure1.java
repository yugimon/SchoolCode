import java.util.Scanner;

public class Adventure1
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String r1, r2, r3, e1;

		System.out.println( "Welcome to Logan's Grand Adveture!" );
		System.out.println();
		System.out.println( "Hello welcome to the world of Landia.");
		System.out.println( "Would you like to be a \"warrior\" or a \"mage\"?" );
		System.out.print( ">" );
		r1 = keyboard.next();

		if (r1.equals("warrior") )
		{
			System.out.println( "You have just became a Warrior!" );
			System.out.println( "Would you like to go on an adventure to defeat the \"dragon\"  or defeat the \"troll king\"? ");
			System.out.print( ">" );
			r2 = keyboard.next();
			if (r2.equals("dragon") )
			{
				System.out.println( "So you want to challenge the Dragon?" );
				System.out.println( "Time to get supplies. Do you get the \"sword\" or the \"crossbow\"?" );
				r3 = keyboard.next();
				if (r3.equals("sword") )
				{
					System.out.println( "You charge off to fight the dragon." );
					System.out.println( "The Dragon is out side its cave. Do you attack the \"tail\" or the \"neck\"?" );
					e1 = keyboard.next();
					if (e1.equals("tail");
					{
						System.out.println( "You rush towards the tail but before you can get there the dragon steps on you." );
						System.out.println( "GAME OVER! What a shame!" );
					}
					else if (e1.equals("neck");
					{
						System.out.println( "You charge towards the dragon and jump at its neck, swinging away." );
						System.out.println( "You chop off the dragons head. You have saved the land from the dragon! You are now rich and famous!" );
					}
					else
					{
						System.out.println( "Error! Error! Can not load file. What a shame!" );
					}
				}
				else if (r3.equals("crossbow") )
				{
					System.out.println( "You charge to the dragon's cave. You take shelter behing a tree withing shooting range of the dragon's cave." );
					System.out.println( "Do you shoot at the dragon's \"eye\" or it's \"body\"?");
					System.out.print(">");
					e1 = keyboard.next();
					if (e1.equals("eye") )
					{
						System.out.println( "You shoot at the dragon's eye. The arrow plants itself into the dragons eye. The dragon begins to thrash around causing the cave to cavein on the dragon." );
						System.out.println( "You have defeated the dragon. You are now know as the best shot throughout the land of landia." );
					}
					else if (e1.equals("body") )
					{
						System.out.println( "You shoot at the dragon's body. The bolt bounces harmlessly off of the dragons scales. The dragon breathing fire at you. The forest you are in burns down and you along with it." );
						System.out.println( "GAME OVER! What a shame!" );
					}
					else
					{
						System.out.println( "Error! Error! Can not load file. What a shame!" );
					}
				}
				else
				{
					System.out.println( "Error! Error! Can not load file. What a shame!" );
				}
			}
			else if (r2.equals("troll king")
			{
				System.out.println( "So you dare to challenge the troll king?" );
				System.out.println( "Are you going to \"storm the castle\" or \"sneak in\"?" );
				System.out.print(">");
				r3 = keyboard.next();
				if (r3.equals("storm the castle");
			}
			else
			{
				System.out.println( "Error! Error! Can not load file. What a shame!" );
			}
		}
		else if (r1.equals("mage") )
		{
			System.out.println( "You have just became a Mage!" );
		}
		else if (r1.equals("king") )
		{
			System.out.println( "You're the king you rule everything and everyone. How Awesome!" );
		}
		else
		{
			System.out.println( "Error! Error! Can not load file. What a shame!" );
		}
	}
}