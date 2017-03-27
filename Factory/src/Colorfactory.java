
public class Colorfactory implements IAbsfactory {

	public IColor setcolor(String color)
	{
		if(color == null)
		{
			return null;
		}
		if(color == "red")
		{
			return new Red();
		}
		if(color == "blue")
		{
			return new Blue();
		}
		if(color == "green")
		{
			return new Green();
		}
		
		return null;
	}
	
	@Override
	public IShape setshape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
}
