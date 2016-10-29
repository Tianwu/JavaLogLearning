package com.ncu.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {
	//severe() warning() info()[Ĭ�ϼ���] config() fine() finer() finest()
	static Logger log = Logger.getLogger(LoggerTest.class.getName());
	public double divide(int n1, int n2) {
		double  res = 0 ;
		try {
			res = n1 / n2;
		}catch(ArithmeticException ae) {
			log.warning("��������Ϊ0");
		}
		return res;
	}
	public static void main(String[] argv) {
		System.out.println(new LoggerTest().divide(1, 0));
		//�������ò���ı����̨����ļ���
		log.setLevel(Level.FINE);
		//ֻ�м������Ĭ�ϼ���info�����Żᱻ�������Ȼ������Ը���
		log.severe("�һᱻ���");
		log.warning("�һᱻ���");
		log.info("�һᱻ���");
		//���½��������
		log.config("�Ҳ��ᱻ���");
		log.fine("�Ҳ��ᱻ���");
		log.finer("�Ҳ��ᱻ���");
		log.finest("�Ҳ��ᱻ���");
	}
}
