package com.test.factory.abst;

public class AbstractFactoryAmd implements AbstractFactory {

	@Override
	public Cpu createCpu() {
		return new CpuAmd();
	}

	@Override
	public Mainboard createMainboard() {
		return new MainboardAmd();
	}

}
