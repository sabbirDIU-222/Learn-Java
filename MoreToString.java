
package hello;

import java.text.DecimalFormat;


public class MoreToString {
      // now toString part
        
        // we know java supermost class is Object
       
        
        String name;
        int age;
        double salary;
        // creating constructor
       private MoreToString(String name,int age,double salary)
        {
            this.name = name;
            this.age = age;
            this.salary = salary;
            
        }
       @Override
       public String toString()
       {
           return name + " " + age + " " + salary;
       }
      
    public static void main(String[] args) {
        
        
        
        // decimal number formetter 
        
        DecimalFormat obj = new DecimalFormat("#,##,###,##0.00");
        System.out.println(obj.format(3332323.321));
        
        DecimalFormat obj1 = new DecimalFormat("0.00");
        double x = 3422.23203133;
        System.out.println(obj1.format(x));
        
        // to format decimal number we need DecimalFormat class object
        // creating two person objcet
        
        MoreToString person1 = new MoreToString("moti",20,3000.22);
        MoreToString person2 = new MoreToString("kola",21,30.22);
        
      
       
        System.out.println("first person :"+person1);// jvm internally call toString method
        System.out.println("seconnd person :"+person2);
        
        
        //The java toString() method is used when we need a string representation of an object. 
        
        
    
        
    }
    
}
/*



run:
3,332,323.32
3422.23
first person :moti 20 3000.22
seconnd person :kola 21 30.22
BUILD SUCCESSFUL (total time: 0 seconds)






*/