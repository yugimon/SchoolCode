public class MidtermOstrich
{
	private double speed;
	
	public MidtermOstrich()
	{
		speed = 0.0;
	}
	
	public MidtermOstrich( double sp)
	{
		speed = sp;
	}
	
	public void print( )
	{
		System.out.println("The speed is: " + speed);
	}
}