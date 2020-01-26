
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
        
        String fname = new String("Shimul islam");
        String lname = new String(" Sabbir");
        
        String name = fname.concat(lname);
        System.out.println(name);
        
        System.out.println(fname.equals(lname));
        
        
        // some more methode in java string 
        
        
        
        String my = "i love my country";
        
        System.out.println(my);
        
        char c = my.charAt(3);// it take the index number and return the value of index
        System.out.println(c);
        
        // if you wanna find any values index number indexOf() method will help you
        
        int position = my.indexOf('m');
        System.out.println("m is in index number : " + position);
        
        //formet method
        
        String s1 = String.format("i tell you %s.", my);
        System.out.println(s1);
        
        String s2 = String.format("i can store number %f",3.34324);
        System.out.println(s2);
        
        // if you wanna to know the ascii value of your string it is easy 
        // to find ascii value we use codePointAt() method 
       
       int value = my.codePointAt(4);
        System.out.println("idex number 4 is v and it's ascii value is : "+value);
        
        // suppose you have lot of string and you wanna know any speceficy string last index  number
        // the lastIndexOf() will help you 
        
        int    jv = my.lastIndexOf('y');
        System.out.println("last position of y is : "+ jv);
           
        
        
        
        // if my string have too much space in front and last i can remove or cut it by a method 
        // it is trim() method 
        // so take another string 
        
        String myOne = "             hello Bangladesh         ";
        System.out.println("myone  String have much space : ");
        String cut = myOne.trim();
        System.out.println(cut);
       
     
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
Shimul islam Sabbir
false
i love my country
o
m is in index number : 7
i tell you i love my country.
i can store number 3.343240
idex number 4 is v and it's ascii value is : 118
last position of y is : 16
myone  String have much space : hello Bangladesh
hello Bangladesh




BUILD SUCCESSFUL (total time: 0 seconds)



