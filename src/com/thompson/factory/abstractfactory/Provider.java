package com.thompson.factory.abstractfactory;

import com.thompson.factory.interfaces.CommonMethods;

/**
 * Producer for specific product
 * 
 * @author liujideng
 * @date 2014-03-11
 */
public interface Provider {
	/**
	 * produce specific product
	 * 
	 * @return product
	 */
	public CommonMethods produce();
}
