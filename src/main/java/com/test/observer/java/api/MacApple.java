package com.test.observer.java.api;

import java.util.Observable;

/**
 * java API自带的被观察者类Observable
 * @author hedong
 * @date 2016年3月13日 下午8:38:19
 * @modifyNote
 * @version 1.0
 */
public class MacApple extends Observable {
	
	private float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
		
		//调用父类被观察者的方法
		this.setChanged();
		this.notifyObservers(price);
	}

	public MacApple(float price) {
		this.price = price;
	}
	
	

}
