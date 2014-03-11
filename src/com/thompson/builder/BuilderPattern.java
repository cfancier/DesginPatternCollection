package com.thompson.builder;

import java.util.ArrayList;
import java.util.List;

import com.thompson.factory.interfaces.CommonMethods;
import com.thompson.factory.product.SimpleFactoryProduct1;
import com.thompson.factory.product.SimpleFactoryProduct2;

/**
 * Builder Pattern
 * 
 * @author liujideng
 * @date  2014-03-11
 */
public class BuilderPattern {
	private List<CommonMethods> list = new ArrayList<CommonMethods>();
	
	public void produceProduct1(int count) {
		 for(int i = 0; i < count; i++) {
			 list.add(new SimpleFactoryProduct1());
		 }
	}
	
	public void produceProduct2(int count) {
		 for(int i = 0; i < count; i++) {
			 list.add(new SimpleFactoryProduct2());
		 }
	}
}
