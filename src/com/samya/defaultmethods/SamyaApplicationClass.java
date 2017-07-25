/**
 * 
 */
package com.samya.defaultmethods;

/**
 * @author Samya Ghosh
 *
 */
public class SamyaApplicationClass implements InterfaceA, InterfaceB {

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		InterfaceA.super.sayHi();
	}
	
	
	public static void main(String args[]){
		
		SamyaApplicationClass SAC = new SamyaApplicationClass();
		SAC.sayHi();
		
	}

}
