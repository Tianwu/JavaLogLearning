package com.ncu.commonslogging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLoggingTest {
	static Log log = LogFactory.getLog(CommonsLoggingTest.class);

	public static void main(String[] args) {
		log.debug("Here is some DEBUG");  
		log.info("Here is some INFO");  
		log.warn("Here is some WARN");  
		log.error("Here is some ERROR");  
		log.fatal("Here is some FATAL");
	}

}
