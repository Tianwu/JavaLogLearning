package com.ncu.logger;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerTest {
	static Logger logger = Logger.getLogger(LoggerTest.class.getName());
	static LogManager logManager = LogManager.getLogManager();
	
	public LoggerTest() {

		try {
//			FileHandler fileHandler = new FileHandler("E:/Test/Log.log", true);
//			fileHandler.setFormatter(new SimpleFormatter()); 
//			logger.addHandler(fileHandler);
			//LogManager.getLogManager().readConfiguration(LoggerTest.class.getResourceAsStream("logging.properties"));
			logManager.readConfiguration(LoggerTest.class.getClassLoader().getResourceAsStream("logger.properties"));
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		logManager.addLogger(logger);
	}
	
	 public double division(int value1, int value2) {  
        double result = 0;  
        try {  
            result = value1 / value2;  
        } catch(ArithmeticException e) { 
			logger.severe("[severe]��������Ϊ0.");  
			logger.warning("[warning]��������Ϊ0.");  
			logger.info("[info]��������Ϊ0.");  
			logger.config("[config]��������Ϊ0.");  
			logger.fine("[fine]��������Ϊ0.");  
			logger.finer("[finer]��������Ϊ0.");  
			logger.finest("[finest]��������Ϊ0.");  
            //e.printStackTrace();  
        }  
        return result;  
    }  
	 
	public static void main(String[] args) {
		System.out.println(new LoggerTest().division(5, 0)); 
		//System.getProperty("user.home")
		//System.out.println(File.separatorChar);
	}

}
