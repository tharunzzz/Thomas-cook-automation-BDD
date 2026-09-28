package utils;

import org.apache.log4j.Logger;

public class LoggerHandler {

	public static Logger logger = Logger.getLogger(LoggerHandler.class);

	public static void trace(String msg) {
		logger.trace(msg);
	}

	public static void debug(String msg) {
		logger.debug(msg);
	}

	public static void info(String msg) {
		logger.info(msg);
	}

	public static void warn(String msg) {
		logger.info(msg);
	}

	public static void error(String msg) {
		logger.info(msg);
	}

	public static void fatal(String msg) {
		logger.info(msg);
	}

}
