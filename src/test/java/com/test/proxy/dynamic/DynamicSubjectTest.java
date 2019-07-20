package com.test.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.test.proxy.stati.RealSubject;
import com.test.proxy.stati.Subject;

public class DynamicSubjectTest {
	
	static Logger logger=Logger.getLogger(DynamicSubjectTest.class);
	
	@Test
	public void testDynamicSubject(){
		
		RealSubject realSubject=new RealSubject();
		
		InvocationHandler invocationHandler=new DynamicProxySubject(realSubject);
		
		Class<?> classz=invocationHandler.getClass();
		
		//Proxy.newProxyInstance返回动态代理的实例，可以作为真实对象RealSubject一样使用
		Subject subject=(Subject)Proxy.newProxyInstance(classz.getClassLoader(),  //动态代理的类加载器
														realSubject.getClass().getInterfaces(), //真实对象实现的接口数组
														invocationHandler);//动态代理对象
		
		subject.request();
		
		int result=subject.add(1, 2);
		
		logger.info(result);
	}
	
	
}
