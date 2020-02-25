package com.epam.task_5.Logging_Demo;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER =LogManager.getLogger(App.class);
			
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        LOGGER.error("PROGRAM TO FIND SIMPLE AND COMPOUND INTEREST");
        LOGGER.error("ENTER PRINCIPLE AMOUNT");
        double principle=sc.nextDouble();
        LOGGER.error("ENTER RATE OF INTEREST");
        double rate=sc.nextDouble();
        LOGGER.error("ENTER TIME PERIOD");
        double time=sc.nextDouble();
        operation2 o=new operation2();
        int findSIorCI;
        do
        {
        	LOGGER.error("\n1.SIMPLE INTEREST\n2.COMPOUND INTEREST\n3.EXIT");
        findSIorCI=sc.nextInt();
        switch(findSIorCI)
        {
        case 1:
        	System.out.printf("SIMPLE INTEREST IS: %.4f\n",o.simpleInterest(principle,rate,time));
        	break;
        case 2:
        	System.out.printf("COMPOUND INTEREST IS: %.4f\n",+o.compoundInterest(principle,rate,time));
        	break;
        case 3:
        	LOGGER.error("Successfully Exited");
        	System.exit(0);
        default:
        	LOGGER.error(" SELECT EITHER 1.SIMPLE INTEREST or 2.COMPOUND INTEREST");
        }
        }while(findSIorCI<=3);
    }
}
