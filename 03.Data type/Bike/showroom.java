class showroom 
{
	public static void main(String[] args) 
	{
		Bike b1  = new Bike();
		Bike b2  = new Bike();
		
		b1.brand              = "honda";
		b1.enumber            = "Two";
		b1.color              = "pink";
		b1.ownername          = "HK";
		b1.Bikeno             = "24 MH 2610";
		b1.owneraddress        = new Address ();
		b1.owneraddress.hno   = 24 ;
		b1.owneraddress.street= "Ameerpet";
		b1.owneraddress.lm    = "CDAC Building";
		b1.owneraddress.city  = "hyderabad";
		
		System.out.println("brand    \t:"        +b1.brand );
		System.out.println("eumber   \t:"       +b1.enumber);
		System.out.println("color    \t:"        +b1.color);
		System.out.println("ownername\t:"    +b1.ownername);
		System.out.println("Bikeno   \t:"       +b1.Bikeno);
		System.out.println("house no \t:"     +b1.owneraddress.hno);
		System.out.println("street   \t:"       +b1.owneraddress.street);
		System.out.println("land mark\t:"    +b1.owneraddress.lm);
		System.out.println("city     \t:"         +b1.owneraddress.city);

	}
}