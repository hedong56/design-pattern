package com.test.factory.method;

public interface Ifactory {
	
	/**
	 * 生产车辆
	 * 泛型方法：泛型的声明，必须在方法的修饰符（public,static,final,abstract等）之后，返回值声明之前
	 * @Description
	 * @author hedong
	 * @date 2016年6月10日 下午7:38:55
	 * @modifyNote 
	 * @return
	 */
	public <T extends Car> T createCar();
	
}
