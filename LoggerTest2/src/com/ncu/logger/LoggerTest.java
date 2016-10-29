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
			logger.severe("[severe]除数不能为0.");  
			logger.warning("[warning]除数不能为0.");  
			logger.info("[info]除数不能为0.");  
			logger.config("[config]除数不能为0.");  
			logger.fine("[fine]除数不能为0.");  
			logger.finer("[finer]除数不能为0.");  
			logger.finest("[finest]除数不能为0.");  
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
