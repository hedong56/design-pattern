package com.test.observer.java.api;

import java.util.Observable;
import java.util.Observer;

import org.apache.log4j.Logger;

/**
 * 观察者模式
 * @author hedong
 * @date 2016年3月13日 下午9:06:52
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
	public void update(Observable o, Object arg) {
		logger.info(name+" 关注的苹果电脑价格更新为："+arg.toString());
	}

}
