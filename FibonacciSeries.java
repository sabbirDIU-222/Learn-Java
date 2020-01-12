
package hello;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        
        int number;
        Scanner input = new Scanner(System.in);
        
        System.out.print("take final destinaion :");
        number = input.nextInt();
        
        int first = 0;
        int second = 1;
        int fibo;
        
        System.out.print(first +" "+ second);
        
        for(int i=3;i<=number;i++)
        {
            fibo = first + second;
            System.out.print(" "+ fibo);
            
            first = second;
            second = fibo;
            
        }
        
        
        
    }
}
