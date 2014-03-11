package com.thompson.factory.staticfactory.producer;

import com.thompson.factory.interfaces.CommonMethods;
import com.thompson.factory.product.SimpleFactoryProduct1;
import com.thompson.factory.product.SimpleFactoryProduct2;

/**
 * Product producer for static factory
 * 
 * @author liujideng
 * @date 2014-03-11
 */
public class StaticFactoryProducer {
	public static CommonMethods produceProduct1() {
		return new SimpleFactoryProduct1();
	}

	public static CommonMethods produceProduct2() {
		return new SimpleFactoryProduct2();
	}
}
