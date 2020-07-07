package com.epam.vijoosh.Logging;

import simpleandcompoundinterest.*;
public class Interest {
	public static void main(String args[]) 
	{
		SIandCI si=new SIandCI();
		si.readsiandciparameters();
		si.simpleinterest();
		si.compoundinterest();
	}

}

