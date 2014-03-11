package com.thompson.factory.product;

import com.thompson.factory.interfaces.CommonMethods;


/**
 * Product of type 2
 * 
 * @author liujideng
 * @date 2014-03-11
 */
public class SimpleFactoryProduct2 implements CommonMethods {
	private static final String TAG = SimpleFactoryProduct2.class.getSimpleName();

	@Override
	public void method1() {
		System.out.println("I am " + TAG);
	}

}
