
package hello;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        
        
        
        // inputing loop
        
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
                System.out.printf("B[%d][%d] = ",row,col);
                B[row][col] = input.nextInt();
                
                
            }
           
        }
        
        
        // printing loop
        
    
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
                        ** output **
                        


run:
take data for A:
A[0][0] = 1
A[0][1] = 2
A[0][2] = 3
A[1][0] = 4
A[1][1] = 5
A[1][2] = 6

take data for B : 
B[0][0] = 7
B[0][1] = 8
B[0][2] = 9
B[1][0] = 5
B[1][1] = 4
B[1][2] = 3
    
    
    
 1 2 3
 4 5 6
 7 8 9
 5 4 3
BUILD SUCCESSFUL (total time: 18 seconds)


