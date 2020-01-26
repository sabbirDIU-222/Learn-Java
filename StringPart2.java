
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
