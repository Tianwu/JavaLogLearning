package com.ncu.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4JTest {
	//FATAL、ERROR、WARN、INFO、DEBUG
	static Logger logger = Logger.getLogger(Log4JTest.class.getClass().getName()); 
	//static Logger errorlog = Logger.getLogger("errorlog");
	public static void main(String[] args) {
		//参数为配置文件的全名log4j.properties
		 PropertyConfigurator.configure("src\\log4j.properties");
		 test1();
		 test2();
	}

	public static void test1() {
		 logger.info("wanghao");
	}
	
	public static void test2() {
		logger.error("error");
		logger.fatal("fatal");
	}
}
