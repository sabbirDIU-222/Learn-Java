
package hello;

import java.util.Scanner;


public class PatternNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Take any number : ");
        num = input.nextInt();
        
        for(int row = 1; row<=num; row++)
        {
            for(int colum = 1 ; colum <= row; colum++)
            {
                System.out.print(" "+colum);
            }
           System.out.println();
        }
       
    }
}
