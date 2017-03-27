
public abstract class Duck {
	
	Quackable q;
	Flyable f;
	Swimable s;
	
	 public void fly()
	{
		System.out.println("I am fly");
	}
	
	public void quack()
	{
		System.out.println("I am quack");
	}
	
	public void swim()
	{
		System.out.println("I am swim");
	}
	
	public void setbehavior(Quackable q , Flyable f , Swimable s)
	{
		this.q = q;
		this.f = f;
		this.s = s;
	}
	
	
	public abstract void display();

}
