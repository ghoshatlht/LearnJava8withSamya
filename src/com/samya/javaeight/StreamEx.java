/**
 * 
 */
package com.samya.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author Samya Ghosh
 *
 */
public class StreamEx {
	
	 public static void main(String[] args) {
	        
	        System.out.println("filter");
	        
	        List<String> list = Arrays.asList( "Learn", "Java8", "with", "Samya Ghosh" );

	        System.out.println("long:");
	        Stream<String> stream = list.stream();
	        Stream<String> filter = stream.filter( (String element) -> element.length() > 5  );
	        List<String> longList = filter.collect( Collectors.toList() );
	        longList.forEach( s -> {
	            System.out.println(" -> "+s);
	        });
	        
	        System.out.println("short");
	        list.stream().filter( element -> element.length() > 5 ).collect( toList() ).forEach( s -> { System.out.println(" -> "+s); } );
	        
	        System.out.println("multifilter");
	        List<String> multiList = list.stream().filter( element -> element.length() > 5 )
	                                 .filter( element -> element.startsWith("I") )
	                                 .collect( toList() );
	        multiList.forEach( s -> {
	            System.out.println(" -> "+s);
	        });
	        
	        System.out.println("parallel");
	        list.parallelStream().forEach( s -> {
	            System.out.println(" -> "+s);
	        });
	        
	        System.out.println("count");
	        long count = list.stream().filter( element -> element.length() > 5 ).count();
	        System.out.println(" -> "+count );

	        System.out.println("length sum");
	        long sum = list.stream().mapToInt( element -> element.length() ).sum();
	        System.out.println("sum : "+sum);
	        
	    }

}
