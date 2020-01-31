
package string;


public class WrapperClass {
    
    public static void main(String[] args) {
        
        // can you say that in java everything is an object ??
        // it will 99.9% oop but why not 100%
        // because of some primitive data type
        // int,float,double,long,char,boolean,short,byte
        // but we can make it an object 
        // and it's called wrapper class 
        // in wrapper class every primitive data type convert into 
        // int->Integer , float->Float,double->Double,
        //so how can we use it
        
        
        int data = 30;
        System.out.println("this is primitive : "+ data);
        
        Integer obj = new Integer(data); // boxing or autoboxing 
        System.out.println("after converting " + obj);
        
        
        double pi = 3.1416;
       
        Double obj1 = Double.valueOf(pi);
        System.out.println("converting primitvie to wrapper : " + obj1);
        
        //  but still  compliler show you some hints 
        // and it's like that "unnecessary boxing to Integer or Double"
        
        // so  we can directly enter it 
        
        float value = 12;
        
        Float obj2 = value;    // autoboxing itwill atumatically convert it Float.valueof() mathod 
    
        System.out.println("after converting into wrapper : " + obj2);
        
        
        // now wrapper classs -> primitive 
        
        // we have already many wrapper object 
        
        
        float vlu = obj2.floatValue(); // unboxing      
        System.out.println("unboxing : " + vlu);
        
       // i can also make it very easy 
       
        int value1 = obj; // auto unboxing
        System.out.println("auto unboxing of obj object : " + value1);
       
    }
    
}


                      **output **
                      
                          run:
this is primitive : 30
after converting 30
converting primitvie to wrapper : 3.1416
after converting into wrapper : 12.0
unboxing : 12.0
auto unboxing of obj object : 30
    
    
BUILD SUCCESSFUL (total time: 0 seconds)

