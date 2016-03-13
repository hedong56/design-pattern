package com.test.observer.java.api;

import java.util.Observer;

import org.apache.log4j.Logger;
import org.junit.Test;

public class PersonTest {
	
	static Logger logger=Logger.getLogger(PersonTest.class);
	
	@Test
	public void testUpdate(){
		
		//被观察者
		MacApple subject=new MacApple(5000);
		//观察者
		Observer observer1=new Person("小明");
		Observer observer2=new Person("小红");
		
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		
		logger.info("第一次改变价格！");
		subject.setPrice(8800);
		
		logger.info("第二次改变价格！");
		subject.setPrice(8600);
		
		//移除观察者2
		subject.deleteObserver(observer2);
		
		logger.info("第三次改变价格！");
		subject.setPrice(8300);
		
	}

}
