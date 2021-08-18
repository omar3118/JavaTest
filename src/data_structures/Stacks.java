
package data_structures;

import java.util.Stack;
// Stack Using Array;
// push pop peek isfull isempty display
public class Stacks <t>{
    int max=100;
    
     int top=-1;
       int arr[]=new int[max];// represent stack useing array 
      
     
       
       void push(int d)
       {
           if(isFull())
           {
               System.out.println("The Stack is Full");return;
           }
           top++;
           arr[top]=d;
           
       }
      
       int pop()
       {
           if(isEmpty())
           {
               System.out.println("The Stack is Empty");return -1;   
           }
           top--;
         return arr[top+1];
       }
       
       
       
       boolean isFull()
       {
           
           
          return top>=(max-1); 
       }
    
    boolean isEmpty()
    {
        
       return top < 0;
    }
    
    void peek()
    {
        if(isEmpty())
        {
             System.out.println("The Stack is Empty");return ; 
        }
        System.out.println(arr[top]);
        
    }
    
    
    
    
    
    
    void Display()// LIFO in Print Or Delete
    {
        if(isEmpty())
            {
               System.out.println("The Stack is Empty");return ;   
           }
        System.out.print("[");
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" , ");
        }
        System.out.print("]");
        
    }
    
  
    
    
    // to check the expression (){}[] balanced
    
    boolean test2(char op,char cl)
    {
        
     
        if(op=='('&&cl==')')return true;
        else if(op=='['&&cl==']')return true;
        else if(op=='{'&&cl=='}')return true;
        return false;
        
    }
    
      
    // to check the expression (){}[] balanced
    
    boolean testExp(String s)
    {
        Stack <Character> ss = new Stack<>();
        
     for(int i=0;i<s.length();i++)
     {
         if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
             ss.push(s.charAt(i));
         else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')
         {
             if(ss.empty()||!test2(ss.peek(),s.charAt(i)))return false;
             ss.pop();
         }
         
     }
       
        
        return ss.empty();
    }
    
}
