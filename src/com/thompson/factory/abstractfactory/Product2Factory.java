package com.thompson.factory.abstractfactory;

import com.thompson.factory.interfaces.CommonMethods;
import com.thompson.factory.product.SimpleFactoryProduct2;

/**
 * Factory for product 2
 * 
 * @author liujideng
 * @date 2014-03-11
 */
public class Product2Factory implements Provider {

	@Override
	public CommonMethods produce() {
		return new SimpleFactoryProduct2();
	}

}
