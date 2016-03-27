package com.test.factory.abst;

public class AbstractFactoryIntel implements AbstractFactory {

	@Override
	public Cpu createCpu() {
		return new CpuIntel();
	}

	@Override
	public Mainboard createMainboard() {
		return new MainboardIntel();
	}

}
