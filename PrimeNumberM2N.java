
package hello;

import java.util.Scanner;


public class PrimeNumberM2N {
    public static void main(String[] args) {
        
        int M,N;
        int count = 0;
        int totalPrime = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter initial number : ");
        M = input.nextInt();
        
        
        System.out.print("enter final number : ");
        N = input.nextInt();
        
        
        for(int i=M;i<=N;i++)
        {
            for(int j = 2; j<=i-1;j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            
            if(count==0)
                {
                    System.out.println(i);
                    totalPrime++;
                }
            count=0;
        }
        System.out.println("total prime number m to n is : " + totalPrime);
        
    }
}
