package com.test.observer;

import java.util.Vector;

/**
 * 具体的被观察者
 * @author hedong
 * @date 2016年3月13日 下午5:18:57
 * @modifyNote
 * @version 1.0
 */
public class ApplePhone implements Subject {
	
	private float price;
	
	public ApplePhone(float price) {
		this.price = price;
	}
	
	/**
	 * 改变价格
	 * @Description
	 * @author hedong
	 * @date 2016年3月13日 下午5:25:25
	 * @modifyNote 
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
		notifyObservers();
	}

	/**
	 * 观察者的集合
	 */
	private Vector<Observer> observers=new Vector<>();
	

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		
		for (Observer observer : observers) {
			observer.update(price);
		}
		
	}

}
