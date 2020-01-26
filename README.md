# Learn-Java
learn core java programming with SABBU 

String in Java

string also can work like an object 



package string;


public class LearnString {
    public static void main(String[] args) {
        
        
        // creating string object by string literal and by new keyword
        
        
        String ef ="shimul ISLAM";  
        String ef1 = new String("shimul islam");
        
        System.out.println(ef);
        System.out.println(ef1);
        
        System.out.println("lenght of ef  = "+ef.length());
        
        if(ef.equalsIgnoreCase(ef1))
        {
            System.out.println("equals");
        }else
        {
            System.out.println("not equals");
        }
        
        boolean in = ef.contains("shimul islam");
        System.out.println(in);
        
        
        boolean inn = ef1.isEmpty();
        System.out.println(inn);
        
    }
}

                   ** output **
                   
                   
                   run:
shimul ISLAM
shimul islam
lenght of ef  = 12
equals
false
false
BUILD SUCCESSFUL (total time: 0 seconds)

                   


