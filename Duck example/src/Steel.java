
public class Steel extends Duck {
	
	public void display()
	{
		System.out.println("I am steel duck");
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
	
	@Override
	public void swim()
	{
		System.out.println("I dont swim");
	}
	
	public void setbehavior()
	{
		super.setbehavior(q, f, s);
	}

}
