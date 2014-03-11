package com.thompson.factory.multiplefactory.producer;

import com.thompson.factory.interfaces.CommonMethods;
import com.thompson.factory.product.SimpleFactoryProduct1;
import com.thompson.factory.product.SimpleFactoryProduct2;

public class MultipleFactoryProducer {
	public CommonMethods produceProduct1() {
		return new SimpleFactoryProduct1();
	}
	
	public CommonMethods produceProduct2() {
		return new SimpleFactoryProduct2();
	}
}
