package com.test.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;

/**
 * 动态代理必须实现InvocationHandler
 * @author hedong
 * @date 2016年3月13日 上午10:44:30
 * @modifyNote
 * @version 1.0
 */
public class DynamicProxySubject implements InvocationHandler {
	
	static Logger logger=Logger.getLogger(DynamicProxySubject.class);
	
	//对真实对象的引用
	private Object realObject;
	
	public DynamicProxySubject(Object realObject){
		this.realObject=realObject;
	}

	//Processes a method invocation on a proxy instance and returns the result
	//处理代理方法的调用，并返回结果
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		printArgs(method,args);
		
		//反射调用方法返回的结果
		Object result=method.invoke(realObject, args);
		
		logger.info("after calling:"+method);
		
		return result;
	}
	
	/**
	 * 打印参数
	 * @Description
	 * @author hedong
	 * @date 2016年3月13日 上午11:47:18
	 * @modifyNote 
	 * @param args
	 */
	public void printArgs(Method method,Object[] args){
		
		logger.info("\n");
		
		logger.info("方法名称："+method.getName());
		
		if(args!=null&&args.length>0){
			String str="";
			for (Object arg : args) {
				str+=arg.toString();
				str+=",";
			}
			
			str=str.replaceAll(",$", "");
			
			logger.info("记录输入参数："+str);
		}else{
			logger.info("，没有传递参数");
		}
	}

}
