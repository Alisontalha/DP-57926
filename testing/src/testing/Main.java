package testing;

public class Main {

	public static void main(String[] args) {
		
		Singleton ss = Singleton.dedeinstance();
		ss.Check();
	}
}

class Singleton	
{
	private static Singleton instance;
	
	private Singleton()
	{
		
	}
	
	public static Singleton dedeinstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
			System.out.println("Instance pehli bar bana dia ha beta !");
		}
		return instance;
	}
	
	public void Check()
	{
		System.out.println("hogaya kam !!!!");
	}
}
		
	