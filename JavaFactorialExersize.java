
package hello;

import java.util.Scanner;


public class JavaFactorialExersize {
    public static void main(String[] args) {
        
     
        
        Scanner in = new Scanner(System.in);
        int num,fact = 1;
        
        System.out.print("enter your number : ");
        num = in.nextInt();
        
        
        
        /*we know that to finding any number factorial we need to multiplies the number 
        using loop
        like 6! = 6*5*4*3*2*1;
        
        */
        
        int i ;
        for(i=num;i>=1;i--)
        {
            fact = fact * i;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("factorial is " + fact);
    }
}
