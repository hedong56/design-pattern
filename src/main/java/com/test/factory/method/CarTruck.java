package com.test.factory.method;

import org.apache.log4j.Logger;

public class CarTruck extends Car {
	static Logger logger=Logger.getLogger(CarTruck.class);
	public CarTruck() {
		logger.info("生产了一辆卡车！");
	}

}
