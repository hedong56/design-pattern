package com.test.factory.method;

public class FactoryTruck implements Ifactory {

	@Override
	public Car createCar() {
		return new CarTruck();
	}

}
