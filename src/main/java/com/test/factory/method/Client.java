package com.test.factory.method;

public class Client {

	public static void main(String[] args) {
		Ifactory factory=new FactorySedan();
		CarSedan carSedan=factory.createCar();
		System.out.println(carSedan.getName());
	}

}
