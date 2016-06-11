package com.test.factory.method;

import org.apache.log4j.Logger;

/**
 * 小轿车
 * @author hedong
 * @date 2016年3月27日 上午11:12:09
 * @modifyNote
 * @version 1.0
 */
public class CarSedan extends Car {

	static Logger logger=Logger.getLogger(CarSedan.class);
	
	public CarSedan() {
		logger.info("生产了一辆小轿车！");
	}
	

	public String getName() {
		return "小轿车";
	}
	
	

}
