package com.thompson.factory.simplefactory.producer;

import com.thompson.factory.config.FactoryInstanceTypes;
import com.thompson.factory.interfaces.CommonMethods;
import com.thompson.factory.product.SimpleFactoryProduct0;
import com.thompson.factory.product.SimpleFactoryProduct1;
import com.thompson.factory.product.SimpleFactoryProduct2;

/**
 * Factory producer for Simple Factory
 * 
 * @author liujideng
 * @date 2014-03-11
 */
public class SimpleFactoryProducer {
	 public CommonMethods produce(FactoryInstanceTypes type) {
		 switch(type) {
		 case FACTORY_INSTANCE_TYPE1 :
			 return new SimpleFactoryProduct1();
		 case FACTORY_INSTANCE_TYPE2 :
			 return new SimpleFactoryProduct2();
		 default:
			 return new SimpleFactoryProduct0();
		 }
	 }
}
