package com.test.decorator;


/**
 * 具体的被装饰者
 * 纯豆浆
 * @author hedong
 * @date 2016年3月14日 下午10:48:14
 * @modifyNote
 * @version 1.0
 */
public class SoyaBeanMilk implements Drink {

	@Override
	public String description() {
		return "纯豆浆";
	}

	@Override
	public float cost() {
		return 5;
	}

}
