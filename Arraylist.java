
package hello;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
       
        
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("the size of array list is "+ number.size());
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        
        System.out.println("the sizee of array list is : " + number.size());
        
        //show the array list
        
        System.out.println(number);
      
        //  add some more array 
        number.add(60);
        number.add(70);
        
        // now show the out put in a loop
        System.out.println("after adding two elements");
        for(int i=0;i<number.size();i++)
        {
            System.out.print(number.get(i)+" ");
        }
        System.out.println();
        // to get or access any item call with each item index number
        System.out.println("to get index number 4 which value is 50");
        System.out.println(number.get(4));
     
        // removing any element by calling it's index nunmber
        
        number.remove(4);
        
        // now showing the all element in for-each loop
        
        System.out.println();
        System.out.println("so we remove the index number 4 which value is 50");
        for(int c : number)
        {
            System.out.print(c + " ");
        }
        
        
        // now we set any number by users 
        // we set any elements by calling it's index number and change the value
        System.out.println();
        System.out.println("we set 2020 at index number 4 by set matheod");
        number.set(4, 2020);
        
        // now showing time
        // we show all index by iterator class method
        
       Iterator variable = number.iterator();
       
       while(variable.hasNext())
       {
           System.out.print(variable.next()+" ");
       }
        
        
        
        
        
        
        
        
        
        
        
        
    }    
}
