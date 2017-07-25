/**
 * 
 */
package com.samya.javaeight;

import java.util.Optional;

/**
 * @author Samya Ghosh
 *
 */
public interface DefaultInterface {
	
	
	 public String getName();
	    
	    public default void sayHello(){
	        Optional<String> name = Optional.ofNullable( this.getName() );
	            name.ifPresent( n -> System.out.println("Hello "+n));
	           	            
	    }

}
