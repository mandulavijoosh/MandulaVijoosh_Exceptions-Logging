package constructioncost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.*;
public class Constructioncost {
	private static final Logger logger=LogManager.getLogger(Constructioncost.class);
	public void costofconstruct(int choice)
	{
		logger.info("Enter area of plot in square meters");
		Scanner sc=new Scanner(System.in);
		long area=sc.nextInt();
		long cost=0;
		switch(choice)
		{
		case 1:cost=area*1200;
		break;
		case 2:cost=area*1500;
		break;
		case 3:cost=area*1800;
		break;
		case 4:cost=area*2500;
		break;
		default:System.out.println("invalid option");
		}
		logger.info("ConstructionCost : "+cost+"INR");
		sc.close();
	}
	

}

