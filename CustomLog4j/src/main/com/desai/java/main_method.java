package com.desai.java;

public class main_method {

	// static Logger logger = LogManager.getLogger(main_method.class);

	static org.apache.logging.log4j.Logger logger2 = org.apache.logging.log4j.LogManager
			.getLogger(main_method.class);

	public static void main(String[] args) {

		
		if (args.length < 2) {
			System.out
					.println("usage: java main_method <port> <http root directory>");
			return;
		}
		new WebServer(Integer.parseInt(args[0]), args[1]);
		// for (int i = 0; i < 1000; i++) {
		// logger2.info("main method");
		// }

	}

}
