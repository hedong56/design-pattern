package com.test.proxy.stati;

/**
 * 真是角色
 * @author hedong
 * @date 2016年3月5日 下午8:30:47
 * @modifyNote
 * @version 1.0
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("我是真实角色!");
	}

}
