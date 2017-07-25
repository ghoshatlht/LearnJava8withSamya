/**
 * 
 */
package com.samya.javaeight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Samya Ghosh
 *
 */
public class DateTimeApi {
	
	public static void main(String[] args){
        LocalDateTime t = LocalDateTime.now();
            t = t.plusDays( 5 ).minusMonths(1).plusYears(1);

        System.out.println("localDate = "+t);
            
        System.out.println("Zones : ");
        ZoneId.getAvailableZoneIds().forEach( zone -> {
            ZonedDateTime zonedDateTime =  ZonedDateTime.now( ZoneId.of(zone) );
            
            System.out.println( "Zone : "+zone );
            System.out.println( zonedDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) );
        });

        
    }

}
