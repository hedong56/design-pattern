package com.test.factory.method;

public class FactoryTruck implements Factory {

	@Override
	public Car createCar() {
		return new CarTruck();
	}

}
