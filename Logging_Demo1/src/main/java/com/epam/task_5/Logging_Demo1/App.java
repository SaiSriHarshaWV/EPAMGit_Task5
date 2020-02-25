package com.epam.task_5.Logging_Demo1;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	
	private static final Logger LOGGER = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LOGGER.info("CONSTRUCTION COST PER SQ FEET");
		LOGGER.info("SELECT THE MATERIAL TYPE");
		LOGGER.info("\n1.STANDARD\n2.ABOVE STANDARD\n3.HIGH STANDARD\n4.HIGH STANDARD AND FULLY AUTOMATED HOME");
		int materialStandard=sc.nextInt();
		LOGGER.info("ENTER THE AREA IN SQ FEET");
		int areaofhouseinsqfeet=sc.nextInt();
		operation3 o=new operation3();
		LOGGER.info("The cost would be: "+o.calcu(materialStandard,areaofhouseinsqfeet)+" INR");
	}

}
