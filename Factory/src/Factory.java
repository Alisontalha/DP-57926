
public class Factory implements IAbsfactory {
	
	public IShape setshape(String shape)
	{
		if (shape == null)
		{
				return null;
		}
		
		else if (shape == "Circle")
		{
			return new Circle();
		}
		
		else if (shape == "Triangle")
		{
			return new Triangle();
		}
		
		else if (shape == "Square")
		{
			return new Square();
		}
		return null;	
	}

	public IColor setcolor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
