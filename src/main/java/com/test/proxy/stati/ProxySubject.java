package com.test.proxy.stati;

/**
 * 代理角色
 * @author hedong
 * @date 2016年3月5日 下午8:31:34
 * @modifyNote
 * @version 1.0
 */
public class ProxySubject implements Subject {
	
	//对真实对象的引用
	private RealSubject realSubject;

	@Override
	public void request() {
		
		//可以换成别的函数
		System.out.println("(代理中)调用真实角色前");
		
		if(realSubject==null){
			realSubject=new RealSubject();
		}
		realSubject.request();
		
		//可以换成别的函数
		System.out.println("(代理中)调用真实角色后");

	}


	@Override
	public int add(int add1, int add2) {
		return 0;
	}

}
