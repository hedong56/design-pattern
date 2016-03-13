package com.test.observer;

import org.apache.log4j.Logger;

/**
 * 具体的观察者
 * @author hedong
 * @date 2016年3月13日 下午5:30:53
 * @modifyNote
 * @version 1.0
 */
public class Person implements Observer {
	
	static Logger logger=Logger.getLogger(Person.class);
	
	private String name;
	
	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(float price) {
		logger.info(name+" 关注的手机价格已更新为："+String.valueOf(price));
	}

}
