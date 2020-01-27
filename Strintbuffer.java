
package string;

import java.util.Scanner;


public class Strintbuffer {
    public static void main(String[] args) {
        
        String s1 = "md shimul islam ";
        
        StringBuffer my = new StringBuffer(s1);
        
        System.out.println("capacity : "+ my.capacity());
        
        my.append("sabbir ");
        System.out.println(my);
      
        
        my.append( 22);
        System.out.println(my);
        
        my.setLength(6);
        System.out.println(my);
                
        my.delete(1, 5);
        System.out.println(my);
        
        
        
        
        my.reverse();
        System.out.println(my);
        
        
       Scanner in = new Scanner(System.in);
       String num ;
       
        System.out.println("takr");
        num = in.next();
        
        
        
        StringBuffer mys = new StringBuffer(num);
        
        String check = mys.reverse().toString();
        
        if(check.equals(num))
        {
            
            System.out.println(mys);
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
        
      
        
        
        
        
    }
    
}


 output
 
 
 run:
capacity : 32
md shimul islam sabbir 
md shimul islam sabbir 22
md shi
mi
im
takr
sas
sas
palindrome
BUILD SUCCESSFUL (total time: 2 seconds)













