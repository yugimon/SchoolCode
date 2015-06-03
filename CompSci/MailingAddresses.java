class Address
{
	String street;
	String city;
	String state;
	int zip;
}

public class MailingAddresses 
{
	public static void main( String[] args )
	{
		Address uno, dos, tres, quatro;
		
		uno = new Address();
		uno.street = "191 Marigold Lane";
		uno.city   = "Miami";
		uno.state  = "FL";
		uno.zip    = 33179;
		
		dos = new Address();
		dos.street = "3029 Losh Lane";
		dos.city   = "Crafton";
		dos.state  = "PA";
		dos.zip    = 15205;
		
		tres = new Address();
		tres.street = "2693 Hannah Street";
		tres.city   = "Hickory";
		tres.state  = "NC";
		tres.zip    = 28601;
		
		quatro = new Address();
		quatro.street = "5432 This is a Street";
		quatro.city   = "Leander";
		quatro.state  = "TX";
		quatro.zip    = 78641;
		
		System.out.println(uno.street + "\n" + uno.city + ", " + uno.state + "  " + uno.zip + "\n");
		System.out.println(dos.street + "\n" + dos.city + ", " + dos.state + "  " + dos.zip + "\n");
		System.out.println(tres.street + "\n" + tres.city + ", " + tres.state + "  " + tres.zip + "\n");
		System.out.println(quatro.street + "\n" + quatro.city + ", " + quatro.state + "  " + quatro.zip + "\n");
	}
}