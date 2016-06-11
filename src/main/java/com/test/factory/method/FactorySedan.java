package com.test.factory.method;

public class FactorySedan implements Ifactory {

	@Override
	public Car createCar() {
		return new CarSedan();
	}

}
