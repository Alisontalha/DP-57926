package calculatorCOR;

public class Sub extends Abstractcal {

	public Sub(int level)
	{
		this.level = level;
	}
	
	protected void dikhade(int num1 , int num2)
	{
		int num = num1 - num2;
		System.out.println("here is the answer which is in level 1 : " + num);
	}
	
}
