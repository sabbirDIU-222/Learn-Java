
package hello;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C = new int[2][3];
        
        System.out.println("take data for A:");
        
        for(int row = 0; row<2 ;row++)
        {
            for(int col = 0; col<3; col++)
            {
                System.out.printf("A[%d][%d] = ",row,col);
                A[row][col] = input.nextInt();

            }
           
        }
        
        System.out.println();
        
        
        System.out.println("take data for B : ");
        for(int row = 0; row<2 ; row++)
        {
            for(int col = 0;col<3;col++)
            {
                System.out.printf("B[%d][%d] = ",row,col);
                B[row][col] = input.nextInt();
                
                
            }
           
        }
        
        System.out.print("A = ");
        for(int row=0;row<2;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.print("\t "+A[row][col]);
            }
            System.out.println();
        }
        
        System.out.println("\n");
        
        System.out.print("B = ");
        
          for(int row=0;row<2;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.print("\t "+B[row][col]);
            }
            System.out.println();
        }
          
          System.out.println();
          System.out.print(" A+B = ");
          
          for(int row=0; row<2; row++)
          {
              for(int col=0; col<3; col++)
              {
                  C[row][col] = A[row][col] + B[row][col];
                  System.out.print("\t " +  C[row][col]);
              }
              System.out.println();
          }
          
        
        
        
        
        
        
        
        
    }
 
}
