package calculatorCOR;

public class Add extends Abstractcal {

	
	public Add(int level)
	{
		this.level = level;
	}
	
	@Override
	protected void dikhade(int num1 , int num2)
	{
		System.out.println("here is the answer which is in level 1 : " + num1 + num2);
	}
}
