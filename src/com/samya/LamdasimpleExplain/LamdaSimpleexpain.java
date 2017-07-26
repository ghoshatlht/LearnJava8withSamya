/**
 * 
 */
package com.samya.LamdasimpleExplain;

/**
 * @author Samya Ghosh
 *
 */


interface A
{
	void show();
}


/*class B implements A
{

	@Override
	public void show() {
		System.out.println("hello from samya");
		
	}
	
}
*/

public class LamdaSimpleexpain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		A obj;
		obj=() ->   // here is the Lamda expression 
		{
		
			System.out.println("hello from samya");
		
		};
		
		
		obj.show();
		
	}

}
