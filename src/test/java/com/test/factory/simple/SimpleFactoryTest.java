package com.test.factory.simple;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * 简单工厂模式
 * @author hedong
 * @date 2016年3月27日 上午10:14:32
 * @modifyNote
 * @version 1.0
 */
public class SimpleFactoryTest {
	
	static Logger logger=Logger.getLogger(SimpleFactoryTest.class);

	@Test
	public void testGetInstance(){
		Doll clothDoll=SimpleFactory.getInstance("cloth");
		if(clothDoll!=null){
			logger.info(clothDoll.getInfo());
		}
		Doll barbieDoll=SimpleFactory.getInstance("barbie");
		if(barbieDoll!=null){
			logger.info(barbieDoll.getInfo());
		}
	}
	

}
