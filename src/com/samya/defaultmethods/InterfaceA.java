/**
 * 
 */
package com.samya.defaultmethods;

/**
 * @author Samya Ghosh
 *
 */
public interface InterfaceA {
	
	public void saySomething();
	
	default public void sayHi(){
		
		System.out.println("hello from interface A");
	}
	
}
