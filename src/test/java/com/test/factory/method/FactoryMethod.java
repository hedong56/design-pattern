package com.test.factory.method;

import org.junit.Test;

public class FactoryMethod {
	
	@Test
	public void testFactory(){
		Factory factorySedan=new FactorySedan();
		Car sedan=factorySedan.createCar();
		
		Factory factoryTruck=new FactoryTruck();
		Car truck=factoryTruck.createCar();
	}

}
