/**
 * 
 */
package com.samya.streamAPIexplain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

/**
 * @author Samya Ghosh
 *
 */
public class StreanAPIexampleSample {

	
	public static void main(String args[])
	{
		List<Integer> val = new ArrayList<>();
		{
			for(int i=1; i<=10; i++)
			{
				val.add(i);
			}
			val.stream().forEach(System.out::println);
		}
		
	}
	
}
