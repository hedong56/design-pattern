package com.test.observer;

/**
 * 被观察者，主题
 * @author hedong
 * @date 2016年3月13日 下午5:06:03
 * @modifyNote
 * @version 1.0
 */
public interface Subject {
	
	/**
	 * 注册添加一个观察者
	 * @Description
	 * @author hedong
	 * @date 2016年3月13日 下午5:07:50
	 * @modifyNote
	 */
	public void addObserver(Observer observer);
	
	/**
	 * 删掉一个观察者
	 * @Description
	 * @author hedong
	 * @date 2016年3月13日 下午5:08:33
	 * @modifyNote
	 */
	public void deleteObserver(Observer observer);
	
	/**
	 * 主题被观察者变化后通知观察者
	 * @Description
	 * @author hedong
	 * @date 2016年3月13日 下午5:09:54
	 * @modifyNote
	 */
	public void notifyObservers();

}
