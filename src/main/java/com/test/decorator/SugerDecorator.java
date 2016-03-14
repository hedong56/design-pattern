package com.test.decorator;

/**
 * 具体的装饰者
 * 糖
 * @author hedong
 * @date 2016年3月14日 下午11:04:03
 * @modifyNote
 * @version 1.0
 */
public class SugerDecorator extends Decorator {

	public SugerDecorator(Drink drink) {
		super(drink);
	}

	@Override
	public String description() {
		return super.description()+"糖";
	}

	@Override
	public float cost() {
		return super.cost()+1;
	}
	
	

}
