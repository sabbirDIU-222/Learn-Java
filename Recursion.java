
package javaoop;


public class Recursion {
    int count  = 0;
    
   public void pp()
    {
        count++;
        while(count<=10)
        {
        System.out.println("helllo world " + count);
        // recursive method
        pp();
        }
       
    }
   
   
   // factorial using recursion 
   // return type INTEGER
  public int test(int n)
   {
       // for special case , we know the factorial of 1 is 1
       
       if(n==1)
       {
           return 1;
           
       }
       // else 1
       else
           return(n*test(n-1));
   }
  
  
  // fibonacci series using recursion in java
  //...........................................................................//
   
  
  
  public int printFibo(int n)
  {
      if(n<=1)
      {
          return 1;
      }
      else
          return printFibo(n-1)+printFibo(n-2);
  }
  
  // if you want to show all the fibonacci series 
  // this recursive method will help you
  
  // first take some variable
  
  int first = 0,second = 1,fibo;
  
  
  
  public void fibon(int count)
  {
      
      if(count>0)
      {
          fibo = first + second;
          first = second;
          second = fibo;
          System.out.print("  " + fibo);
          fibon(count-1);
      }
  }
   
}
// test recursion classs to create object of Recursion classs


 class TestRecursion{
    public static void main(String[] args) {
        
        
        Recursion recur = new Recursion();
        recur.pp();
        
        System.out.println("recursion of 5 is :  " + recur.test(5));
        
        int n = 5;
        
        System.out.println("fiibonacci " + recur.printFibo(n));
        
        System.out.println("  ");
        
        // print fibo
        // take a primitive data type integer 
        // which is the perameter of fibon() method
        
        int count = 9;
        System.out.print(recur.first + " " + recur.second);// print first and second number
        recur.fibon(count-2);// because  2 number are already printed
        
        
    }
 
    
}



********out put************


run:
helllo world 1
helllo world 2
helllo world 3
helllo world 4
helllo world 5
helllo world 6
helllo world 7
helllo world 8
helllo world 9
helllo world 10
recursion of 5 is :  120
fiibonacci 8
  
0 1  1  2  3  5  8  13  21BUILD SUCCESSFUL (total time: 0 seconds)




