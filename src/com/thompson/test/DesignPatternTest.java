package com.thompson.test;

import com.thompson.factory.abstractfactory.Product1Factory;
import com.thompson.factory.abstractfactory.Provider;
import com.thompson.factory.config.FactoryInstanceTypes;
import com.thompson.factory.interfaces.CommonMethods;
import com.thompson.factory.multiplefactory.producer.MultipleFactoryProducer;
import com.thompson.factory.simplefactory.producer.SimpleFactoryProducer;
import com.thompson.factory.staticfactory.producer.StaticFactoryProducer;
import com.thompson.singleton.Singleton;

/**
 * Tests for corresponding software modules
 * 
 * @author liujideng
 * @date 2014-03-11
 */
public class DesignPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * SimpleFactory test
		 */
		SimpleFactoryProducer producer = new SimpleFactoryProducer();
		CommonMethods product = producer.produce(FactoryInstanceTypes.FACTORY_INSTANCE_TYPE1);
		product.method1();
		
		/**
		 * MultipleFactory test
		 */
		MultipleFactoryProducer mulProducer = new MultipleFactoryProducer();
		CommonMethods mulProduct = mulProducer.produceProduct2();
		mulProduct.method1();
		
		/**
		 * StaticFactory test
		 */
		CommonMethods staticProduct = StaticFactoryProducer.produceProduct1();
		staticProduct.method1();
		
		/**
		 * AbstractFactory test
		 */
		Provider provider = new Product1Factory();
		CommonMethods abstractProduct = provider.produce();
		abstractProduct.method1();
		
		
		/**
		 * Singleton test
		 */
		Singleton instance1 = Singleton.getInstance1();
		Singleton instance2 = Singleton.getInstance2();
		Singleton instance3 = Singleton.getInstance1();
		instance1.sayHello();
		instance2.sayHello();
		instance3.sayHello();
	}

}
