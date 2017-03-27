package calculatorCOR;

public abstract class Abstractcal {

	public static int number1;
	public static int number2;
	
	protected Abstractcal nextoperation;
	protected int level;
	
	public void setnextoperator(Abstractcal nextoperation)
	{
		this.nextoperation = nextoperation;
	}
	
	public void messagedikhade(int num1 , int num2)
	{
		if (this.level <= level)
		{
			dikhade(num1 , num2);
		}
		
		if(nextoperation != null)
		{
			nextoperation.messagedikhade(number1 , number2);
		}
	}
	
	abstract protected void dikhade(int num1 , int num2);
	
	
	
}
