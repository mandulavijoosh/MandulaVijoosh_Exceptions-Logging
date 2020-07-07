package com.epam.vijoosh.Logging;

import constructioncost.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class CostOfConstruction {
	private static final Logger logger=LogManager.getLogger(CostOfConstruction.class); 
	public static void main(String args[]) 
	{
		logger.info("Select your choice");
		logger.info("1.standard materials  2.Above standard materials  3.High standard materials  4.High standard and fully Automated home");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		Constructioncost con=new Constructioncost();
		con.costofconstruct(choice);
		sc.close();
	}
}