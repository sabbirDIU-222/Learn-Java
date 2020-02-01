
package string;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class Date {
    
    public static void main(String[] args) {
        
        // to find current date we can use this LocalDate class and .now() is a method 
        // of this class
        
        
        LocalDate date = LocalDate.now();
        
        System.out.println("local date is now :  " + date);
        
        
        
        // to find local time 
        
        LocalTime time = LocalTime.now(); // this LocalTime class will help you to find local time
        System.out.println("local time : " + time);
        
        LocalDateTime on = LocalDateTime.now();
        
        
        
        // we can formeted our local time
        
        DateTimeFormatter obj  = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
       
        // for formatted time we need to declare a String type obj 
        // and we assign our LocalDateTime classes object 
        // then we put . operator and type format() method 
        
        
        String obj3 = on.format(obj);
        System.out.println("after formatted : " + obj3);
    
        
    }
}
                               ** output ** 
                               
                               
                                   
                                   
                                   run:
local date is now :  2020-02-01
local time : 21:56:55.061
after formatted : 01/02/2020 21:56:55
    
    
BUILD SUCCESSFUL (total time: 0 seconds)

