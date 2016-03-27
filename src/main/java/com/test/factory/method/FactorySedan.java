package com.test.factory.method;

public class FactorySedan implements Factory {

	@Override
	public Car createCar() {
		return new CarSedan();
	}

}
