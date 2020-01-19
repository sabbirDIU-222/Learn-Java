
package hello;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        
        System.out.println("take data for A:");
        
        for(int row = 0; row<2 ;row++)
        {
            for(int col = 0; col<3; col++)
            {
                System.out.printf("A[%d][%d] =",row,col);
                A[row][col] = input.nextInt();
                
      
            }
           
        }
        
        System.out.println();
        
        
        System.out.println("take data for B : ");
        for(int row = 0; row<2 ; row++)
        {
            for(int col = 0;col<3;col++)
            {
                System.out.printf("A[%d][%d] = ",row,col);
                B[row][col] = input.nextInt();
                
                
            }
           
        }
        
    
        for(int row=0;row<2;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.print(" "+A[row][col]);
            }
            System.out.println();
        }
        
        
          for(int row=0;row<2;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.print(" "+B[row][col]);
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        
    }
 
}
