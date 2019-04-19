package demo.log.stdy_log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static final Logger logger = LogManager.getLogger("Test");
	
    public static void main( String[] args )
    {
    	logger.info("info");
    	logger.debug("debug");
    	logger.error("error");
    }
}
