
package hello;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C = new int[2][3];
        
        
        // taking input
        
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
        
        
        
        
        // printing
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
        
                   // add two matrix
        
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
B[0][0] = 6
B[0][1] = 5
B[0][2] = 4
B[1][0] = 3
B[1][1] = 2
B[1][2] = 1
    
A = 	 1	 2	 3
	     4	 5	 6


B = 	 6	 5	 4
	     3	 2	 1

 A+B = 	 7	 7	 7
	     7	 7	 7
BUILD SUCCESSFUL (total time: 11 seconds)

