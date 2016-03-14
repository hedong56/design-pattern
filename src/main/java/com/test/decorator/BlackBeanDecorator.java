package com.test.decorator;

/**
 * 具体的装者对象
 * 黑豆
 * @author hedong
 * @date 2016年3月14日 下午11:08:24
 * @modifyNote
 * @version 1.0
 */
public class BlackBeanDecorator extends Decorator {

	public BlackBeanDecorator(Drink drink) {
		super(drink);
	}

	@Override
	public String description() {
		return super.description()+"黑豆";
	}

	@Override
	public float cost() {
		return super.cost()+3;
	}
	
	

}
