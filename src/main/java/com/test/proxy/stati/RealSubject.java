package com.test.proxy.stati;

import org.apache.log4j.Logger;


/**
 * 	真是角色
 * @author hedong
 * @date 2016年3月5日 下午8:30:47
 * @modifyNote
 * @version 1.0
 */
public class RealSubject implements Subject {

	static Logger logger=Logger.getLogger(RealSubject.class);
	
	@Override
	public void request() {
		logger.info("我是真实角色!");
	}

	@Override
	public int add(int add1, int add2) {
		return add1+add2;
	}


}
