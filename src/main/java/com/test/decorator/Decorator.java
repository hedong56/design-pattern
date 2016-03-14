package com.test.decorator;

/**
 * 装饰者基类
 * @author hedong
 * @date 2016年3月14日 下午10:58:40
 * @modifyNote
 * @version 1.0
 */
public abstract class Decorator implements Drink {
	
	//要被装饰的对象
	private Drink drink;
	
	public Decorator(Drink drink) {
		super();
		this.drink = drink;
	}

	@Override
	public String description() {
		return drink.description();
	}

	@Override
	public float cost() {
		return drink.cost();
	}

}
