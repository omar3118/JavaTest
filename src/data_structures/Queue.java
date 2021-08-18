
package data_structures;

public class Queue {
  
 
    
   int max=100;
    int arr[]=new int[max];
   int count=0;
    int front=-1;
   int rear=max-1;//spectial case


public void enqueue(int e)
{

    
    
    if(isFull())
    {
        System.out.println("The Queue is Full");
        return;
    }
    if(isEmpty())
    {
        // like a circul
    front=(front+1)%max;
    rear=(rear+1)%max;
    arr[front]=e;
    }
    else
    {
     rear=(rear+1)%max;
     arr[rear]=e;
    }
       count++;
}


public int dequeue()
{
    if(isEmpty())
    {
        System.out.println("The Queue is Empty");   
        return -1;
    }

 int t=arr[front];
    
front=(front+1)%max;

count--;
return t;
}

boolean isEmpty()
{
    
    return count==0;
}

boolean isFull()
{
    
     return count>=max;
}


public void Display()
{

if(isEmpty())
     {
        System.out.println("The Queue is Empty");   
        return;
    }
int h=front;
int c=count;
    System.out.print("[ ");
while(c!=0)
{
    System.out.print( arr[h]+" ");
    h=(h+1)%max;
    c--;
}
    System.out.println("]");
}

    
}
