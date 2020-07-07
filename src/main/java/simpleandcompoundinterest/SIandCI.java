package simpleandcompoundinterest;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SIandCI{
	int principleamount,timeperiod,rateofinterest;
	private static final Logger logger=LogManager.getLogger(SIandCI.class); 
public void readsiandciparameters()
{
	Scanner sc=new Scanner(System.in);
	logger.info("Enter principleamount");
	principleamount=sc.nextInt();
	logger.info("Enter timeperiod");
	timeperiod=sc.nextInt();
	logger.info("enter rate of interest");
	rateofinterest=sc.nextInt();
	sc.close();
}
public void simpleinterest()
{
	float si=(principleamount*timeperiod*rateofinterest);
	si=si/100;
	logger.info("simple interest : "+si);
}
public void compoundinterest( )
{ 
 float ci=principleamount*(float)Math.pow((1+rateofinterest*0.01),timeperiod)-principleamount;
 
 logger.info("compound interest : "+ci);
}

}
