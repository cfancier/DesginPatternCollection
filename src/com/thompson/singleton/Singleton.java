package com.thompson.singleton;

import java.util.Vector;

/**
 * singleton
 * 
 * @author liujideng
 * @date 2014-03-11
 */
public class Singleton {
	private static Singleton ins = null;
	@SuppressWarnings("rawtypes")
	private Vector properties = null;
	
	@SuppressWarnings("rawtypes")
	public Vector getProperties() {
		return properties;
	}
	
	private Singleton() {
		System.out.println("singleton instance has been established!");
	}
	
	private static class SingletonFactory {
		private static Singleton instance = new Singleton();
		
		static {
			System.out.println("In SingletonFactory...");
		}
	}
	
	/**
	 * Method 1 -- ensure the instace has been allocated with space and initialized
	 * 
	 * @return
	 */
	public static Singleton getInstance1() {
		System.out.println("In getInstance1()");
		return SingletonFactory.instance;
	}
	
	/**
	 * ensure the instace is the same before and after serialization
	 * 
	 * @return
	 */
	public Object readResolve() {
		return getInstance1();
	}
	
	/**
	 * Method 2 -- separate the establishment of ins from getInstance() and
	 * add synchronized to synchronize the process
	 */
	private static synchronized void syncInit() {
		if(null == ins) {
			System.out.println("In syncInit(), ins is null, establish one!");
			ins = new Singleton();
		}
	}
	
	public static Singleton getInstance2() {
		if(null == ins) {
			System.out.println("In getInstance2(), ins is null, call syncInit()!");
			syncInit();
		}
		
		System.out.println("now return ins " + ins.toString());
		return ins;
	}
	
	public void sayHello() {
		System.out.println("Hello, I am a singleton!" + this.toString());
	}
	
	/**
	 * synchronizing updating the properties of the singleton instance
	 */
	public void updateProperties() {
		Singleton shadow = new Singleton();
		properties = shadow.getProperties();
	}
}
