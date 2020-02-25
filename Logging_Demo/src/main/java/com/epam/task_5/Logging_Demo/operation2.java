package com.epam.task_5.Logging_Demo;
import java.lang.Math;
import java.util.Scanner;

public class operation2 {
	
	double simpleInterest(double principle,double rate,double time)
	{
		double simpleinterest=0;
		simpleinterest=(principle*rate*time)/100;
		return simpleinterest;
	}
	double compoundInterest(double principle,double rate,double time)
	{
		double calculation=0,compoundinterest;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.YEARLY\n2.HALF YEARLY\n3.QUARTELY\n4.EVERY MONTH");
        int a=sc.nextInt();
		switch(a)
		{
		case 1:
			calculation=1+rate/100;
			calculation=Math.pow(calculation,time);
			break;
		case 2:
			calculation=1+rate/200;
			time=time*2;
			calculation=Math.pow(calculation,time);
			break;
		case 3:
			calculation=1+rate/400;
			time=time*4;
			calculation=Math.pow(calculation,time);
			break;
		case 4:
			calculation=1+rate/1200;
			time=time*12;
			calculation=Math.pow(calculation,time);
			break;
		default:
			System.out.println("ENTER CORRECT CHOICE");
		}
		compoundinterest=principle*(calculation-1);
		return compoundinterest;
	}
}
