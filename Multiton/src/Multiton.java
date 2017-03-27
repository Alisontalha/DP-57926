import java.util.HashMap;

public class Multiton {
	
	private static HashMap<Object, Multiton> instances = new HashMap<Object, Multiton>();
	private static Multiton instance;
	
	private Multiton()
	{
	}
	
	public static Multiton dedeinstance(Object key)
	{
		int count =1;
		for(int i = count; i<count+1; i++)
		{
		
		if(instances.containsKey(key))
		{
		instance = (Multiton) instances.get(key);
		if(instance == null)
		{
			instance = new Multiton();
			instances.put(key, instance);
		}
		}
		}
		System.out.println("Instance Number is : " + key);
		return instance;
	}
	

}


