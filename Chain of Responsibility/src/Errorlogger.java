
public class Errorlogger extends AbstractLogger {

	 public Errorlogger(int level){
	      this.level = level;
	   }
	 
	@Override
	   protected void write(String message) {		
	      System.out.println("Error Console::Logger: " + message);
	   }
	
}
