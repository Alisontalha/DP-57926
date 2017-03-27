
public class Chainpattern {

	
	private static AbstractLogger getChainOfLoggers(){

	      AbstractLogger errorLogger = new Errorlogger(AbstractLogger.ERROR);
	      AbstractLogger fileLogger = new Filelogger(AbstractLogger.DEBUG);
	      AbstractLogger consoleLogger = new Consolelogger(AbstractLogger.INFO);

	      errorLogger.setnextlogger(fileLogger);
	      fileLogger.setnextlogger(consoleLogger);

	      return errorLogger;	
	   }

	   public static void main(String[] args) {
	      AbstractLogger loggerChain = getChainOfLoggers();

	      loggerChain.logmessage(AbstractLogger.INFO, 
	         "This is an information.");

	      loggerChain.logmessage(AbstractLogger.DEBUG, 
	         "This is an debug level information.");

	      loggerChain.logmessage(AbstractLogger.ERROR, 
	         "This is an error information.");
	   }
}
