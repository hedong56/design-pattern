package com.test.decorator;

import org.apache.log4j.Logger;
import org.junit.Test;

public class DecoratorTest {
	
	static Logger logger=Logger.getLogger(DecoratorTest.class);
	
	@Test
	public void testDecorator(){
		//鸡蛋
		Drink soya=new SoyaBeanMilk();
		//在豆浆中加鸡蛋
		EggDecorator egg=new EggDecorator(soya);
		//继续加糖
		SugerDecorator eggSuger=new SugerDecorator(egg);
		//继续加黑豆
		BlackBeanDecorator eggSugerBlackBean=new BlackBeanDecorator(eggSuger);
		
		logger.info("豆浆总名称："+eggSugerBlackBean.description());
		logger.info("豆浆总价格："+eggSugerBlackBean.cost());
		
		
	}
	
}
