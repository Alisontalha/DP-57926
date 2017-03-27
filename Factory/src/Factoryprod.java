
public class Factoryprod {

	public IAbsfactory getfactory(String factory)
	{
		if(factory.equals("shape"))
		{
			return new Factory();
		}
		else if(factory == "color")
		{
			return new Colorfactory();
		}
		
		return null;
		
	}
	
}
