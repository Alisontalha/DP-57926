
public class Rubber extends Duck {

	public void display()
	{
		System.out.println("I am Rubber duck");
	}
	
	@Override
	public void quack()
	{
		System.out.println("I dont quack, I squeez !");
	}
	
	@Override
	public void fly()
	{
		System.out.println("I dont fly !");
	}
	
	public void setbehavior()
	{
		super.setbehavior(q, f, s);
	}
	
}
