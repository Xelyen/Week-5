
public class App {
	
	static Logger logger;

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		
		logger.Log("Hello");
		logger.Error("Hello");
		
		Logger logger2 = new SpacedLogger();
		
		logger2.Log("Hello");
		logger2.Error("Hello");

	}

}
