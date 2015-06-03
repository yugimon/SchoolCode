
public class Game1
{
	public static void main( String[] args )
	{
		JFrame win = new JFrame("Stick");
		win.setSize(1010,735);
		win.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		win.add( new Stick() );
		win.setVisible(true);
	}
	public Stick()
	
}