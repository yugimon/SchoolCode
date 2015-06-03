import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

class Room
{
	int roomNumber;
	String roomName;
	String description;
	int asave, numExits;
	String[] exits = new String[10];
	int[] destinations = new int[10];
}

public class TextAdventureFinal
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		
		Room[] rooms = loadRoomsFromFile("text-adventure-rooms.txt");
		
		showAllRooms(rooms);
		
		int currentRoom = 0;
		String ans;
		while ( currentRoom >= 0 )
		{
			Room cur = rooms[currentRoom];
			System.out.println("You can save at any time by typing \"save\" and you can load that save by typing \"load\"." );
			System.out.println();
			System.out.print( cur.description );
			System.out.print("> ");
			ans = keyboard.nextLine();
			
			boolean found = false;
			for ( int i=0; i<cur.numExits; i++ )
			{
				if ( cur.exits[i].equals(ans) )
				{
					found = true;
					currentRoom = cur.destinations[i];
				}
				else if ( ans.equals("save"))
				{
					found = true;
					PrintWriter out = new PrintWriter( new FileWriter("AdventureSave.txt") );
					out.println(currentRoom);
					out.close();
					System.out.println("Ok game saved");
						
				}
				else if (ans.equals("load"))
				{
					found = true;
					Scanner file = null;
					try
					{
						file = new Scanner(new java.io.File("AdventureSave.txt"));
					}
					catch ( java.io.IOException e )
					{
					System.err.println("Sorry, I can't read save from the file 'AdventureSave.txt'.");
					System.exit(1);
					}
					currentRoom = file.nextInt();
					
				}
				
			}
			if ( ! found )
				System.out.println("Sorry, I don't understand.");
		}
	}
	
	public static Room[] loadRoomsFromFile( String filename )
	{
		Scanner file = null;
		try
		{
			file = new Scanner(new java.io.File(filename));
		}
		catch ( java.io.IOException e )
		{
			System.err.println("Sorry, I can't read from the file '" + filename + "'.");
			System.exit(1);
		}
		
		int numRooms = file.nextInt();
		Room[] rooms = new Room[numRooms];
		
		int roomNum = 0;
		while ( file.hasNext() )
		{
			Room r = getRoom(file);
			if ( r.roomNumber != roomNum )
			{
				System.err.println("Reading room # " + r.roomNumber + ", but " + roomNum + " was expected.");
				System.exit(2);
			}
			rooms[roomNum] = r;
			roomNum++;
		}
		file.close();
		
		return rooms;
	}
	
	public static void showAllRooms( Room[] rooms )
	{
		for ( Room r : rooms )
		{
			String exitString = "";
			for ( int i=0; i<r.numExits; i++ )
				exitString += "\t" + r.exits[i] + " (" + r.destinations[i] + ")";
			System.out.println( r.roomNumber + ") " + r.roomName + "\n" + exitString );
		}
	}
	
	public static Room getRoom( Scanner f )
	{
		if ( ! f.hasNextInt() )
			return null;
			
		Room r = new Room();
		String line;
		
		r.roomNumber = f.nextInt();
		f.nextLine();
		
		r.roomName = f.nextLine();
		
		r.description = "";
		while ( true )
		{
			line = f.nextLine();
			if ( line.equals("%%") )
				break;
			r.description += line + "\n";
		}
		
		int i = 0;
		while ( true )
		{
			line = f.nextLine();
			if ( line.equals("%%") )
				break;
			String[] parts = line.split(":");
			r.exits[i] = parts[0];
			r.destinations[i] = Integer.parseInt(parts[1]);
			i++;
		}
		r.numExits = i;
		
		return r;
	}
}