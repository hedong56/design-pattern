package com.test.factory.method;

import org.junit.Test;

public class FactoryMethod {
	
	@Test
	public void testFactory(){
		Ifactory factorySedan=new FactorySedan();
		Car sedan=factorySedan.createCar();
		
		Ifactory factoryTruck=new FactoryTruck();
		Car truck=factoryTruck.createCar();
	}

}
