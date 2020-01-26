
package string;


public class StringPart2 {
    public static void main(String[] args) {
        
        String s1 = "sabbir is a good man , he is good , he love good people";
        System.out.println(s1);
        
        String s2 = s1.replace("is", "was");
        System.out.println("after_replace : " + s2);
        
        String[] s3 = s1.split(" love ");
        
        for(String v : s3)
        {
            System.out.println(" " + v);
        }
    
    }
    
}


    ** output **
    
        run:


sabbir is a good man , he is good , he love good people
after_replace : sabbir was a good man , he was good , he love good people
 sabbir
 is
 a
 good
 man
 ,
 he
 is
 good
 ,
 he
 love
 good
 people
BUILD SUCCESSFUL (total time: 0 seconds)

        
        
        
        
        
        
        
        
        
