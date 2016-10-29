package com.ncu.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {
	//severe() warning() info()[默认级别] config() fine() finer() finest()
	static Logger log = Logger.getLogger(LoggerTest.class.getName());
	public double divide(int n1, int n2) {
		double  res = 0 ;
		try {
			res = n1 / n2;
		}catch(ArithmeticException ae) {
			log.warning("除数不能为0");
		}
		return res;
	}
	public static void main(String[] argv) {
		System.out.println(new LoggerTest().divide(1, 0));
		//这种设置不会改变控制台输出的级别
		log.setLevel(Level.FINE);
		//只有级别高于默认级别【info】，才会被输出，当然级别可以更改
		log.severe("我会被输出");
		log.warning("我会被输出");
		log.info("我会被输出");
		//以下将不会输出
		log.config("我不会被输出");
		log.fine("我不会被输出");
		log.finer("我不会被输出");
		log.finest("我不会被输出");
	}
}
