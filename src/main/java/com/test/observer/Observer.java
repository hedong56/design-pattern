package com.test.observer;

/**
 * 观察者接口
 * @author hedong
 * @date 2016年3月13日 下午5:11:15
 * @modifyNote
 * @version 1.0
 */
public interface Observer {
	
	/**
	 * 观察者监听更新信息(价格)的方法
	 * @Description
	 * @author hedong
	 * @date 2016年3月13日 下午5:12:43
	 * @modifyNote 
	 * @param price
	 */
	void listenTo(float price);

}
