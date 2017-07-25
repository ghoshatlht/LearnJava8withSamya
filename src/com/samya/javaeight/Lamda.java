/**
 * 
 */
package com.samya.javaeight;

import java.util.Arrays;
import java.util.List;

/**
 * @author Samya Ghposh
 *
 */
public class Lamda extends Learnjavaeightwithsamya {
	
	
	public String getName()
	{
		return this.getClass().getName();
		
	}
	
	public static void main(String artgs[])
	{
		List<String> list = Arrays.asList("Learn", "Java8", "with", "Samya Ghosh");
		list.forEach((String s) -> {
			System.out.println(s);
		});
		
		list.forEach(s -> System.out.println(" -> " +s));
		
		
	}
}
