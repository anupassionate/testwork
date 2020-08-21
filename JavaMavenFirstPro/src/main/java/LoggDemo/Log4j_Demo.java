package LoggDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_Demo {
private static Logger logger = LogManager.getLogger(Log4j_Demo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\nHello world.........\n");
		logger.trace("this is trace message");
logger.info("this is info message");
logger.error("this is an error message");
logger.warn("this is an warning message");
logger.fatal("this is an fetal message");
System.out.println("complited");


	}

}
