package com.test.factory.simple;

/**
 * 简单工厂模式
 * @author hedong
 * @date 2016年3月27日 上午10:14:32
 * @modifyNote
 * @version 1.0
 */
public class SimpleFactory {

	public static Doll getInstance(String name){
		Doll doll=null;
		if("cloth".equals(name)){
			doll=new ClothDoll();
		}
		if("barbie".equals(name)){
			doll=new BarbieDoll();
		}
		return doll;
	}

}
