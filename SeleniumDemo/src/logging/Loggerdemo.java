package logging;
import org.apache.logging.log4j.*;

public class Loggerdemo {

	public static void main(String[] args) {
		
		Logger log = LogManager.getLogger("Loggerdemo");
		System.out.println("this is logger demo");
		
		log.info("for info only");
		log.debug("for debug only");
		log.error("for error only");
		log.warn("for warning only");
	}

}

