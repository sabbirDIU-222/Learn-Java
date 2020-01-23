
package hello;

import java.util.Scanner;

public class Times {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int seconds;
        int min,sec;
        
        System.out.print("take any large seconds :");
        seconds = input.nextInt();
        
        
        min = seconds/60;
        sec = seconds % 60;
        
        System.out.println("total minute is : "+min);
        System.out.println("total reminder second is : "+sec);
        
    }
}
