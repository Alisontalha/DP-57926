
public class Wooden extends Duck {
	
	public void display()
	{
		System.out.println("I am a wooden duck");
	}
	
	@Override
	public void fly()
	{
		System.out.println("I dont fly");
	}
	
	@Override
	public void quack()
	{
		System.out.println("I dont quack");
	}
	
	public void setbehavior()
	{
		super.setbehavior(q, f, s);
	}

	
}
