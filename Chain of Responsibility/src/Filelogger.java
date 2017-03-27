
public class Filelogger extends AbstractLogger {

	
	public Filelogger(int level)
	{
		this.level = level;
	}
	
	@Override
	public void write(String message)
	{
		System.out.println("File::logger " + message);
	}
	
}
