package com.epam.task_5.Logging_Demo1;

public class operation3 {
	int calcu(int materialStandard,int areaofhouseinsqfeet)
	{
		int cost=0;
		switch(materialStandard)
		{
		case 1:
			 cost=1200*areaofhouseinsqfeet;
			break;
		case 2:
			 cost=1500*areaofhouseinsqfeet;
			break;
		case 3:
			 cost=1800*areaofhouseinsqfeet;
			break;
		case 4:
			 cost=2500*areaofhouseinsqfeet;
			break;
	}
		return cost;
	}
}
