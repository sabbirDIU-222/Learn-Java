
package hello;

import java.util.Scanner;


public class CheckPrimeOrNot
{
        public static void main(String[] args) {
         
        int number , i;
        int count = 0;
        Scanner input = new Scanner(System.in);
        
            System.out.print("take any positive intiger : ");
            number = input.nextInt();
            
            for(i = 2; i< number ;i++)
            {
                if(number%i==0)
                {
                    count++;
                    break;
                }
               
            }
             if(count==0)
                {
                    System.out.println("prime number");
                }
                else
                {
                    System.out.println("not a prime number");
                }
    }
        
    
}
