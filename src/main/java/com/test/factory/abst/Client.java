package com.test.factory.abst;

import org.apache.log4j.Logger;

public class Client {

	static Logger logger=Logger.getLogger(Client.class);
	
	public static void main(String[] args) {
		
		AbstractFactory af=new AbstractFactoryIntel();
		
		Cpu cpuIntel=af.createCpu();
		logger.info(cpuIntel.getCpuName());
		
		Mainboard mainBoardIntel=af.createMainboard();
		logger.info(mainBoardIntel.getMainBoardName());
		
		
		
		
//		Mainboard mainBoardIntel=new MainboardIntel();
//		logger.info(mainBoardIntel.getMainBoardName());
		
	}

}
