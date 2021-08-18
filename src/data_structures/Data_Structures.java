
// implementaion for array (A)
// implementation for arraylist (B)
// implementaion for LinkedList (LinkedList)
// implementaion for DoublyLinkedList (DoublyLinkedList)
package data_structures;

//import java.util.LinkedList;
//import java.time.Instant;
//import java.util.Stack;
import java.util.Arrays;
import java.util.Scanner;


public class Data_Structures 
{ 
   
    
    static Scanner sc=new Scanner(System.in);
    
//static DoublyLinkedList dl=new DoublyLinkedList();
//static LinkedList l=new LinkedList();
//static LinkedList<Integer> n=new LinkedList<>();// Class in Java
    
//static Stack ss=new Stack();// Class
// static Stacks s=new Stacks();

//static Queue q=new Queue();

    static int[] pri ={9,8,7,33,5,4,3,2,1,0,33,334,33,225,55,55,33,33,1,2,0,3};// call by referance
    static int[] prii ={4,3,2,1};
    static Node node=new Node(0);
    static BinaryTree bt=new BinaryTree();

 static BinarySearch b= new BinarySearch();
 
 static SelectionSort s= new SelectionSort(pri);
 
 static InsertionSort i= new InsertionSort(pri);
 
 static MergeSort m=new MergeSort();
 static HeapSort hs=new HeapSort();
 static QuickSort qs=new QuickSort(); 
    public static void main(String[] args)
    {  
   /*   m.MS(prii);
       m.Display();

       s.Dsort();
        s.Display();
        
       i.Asort();
        i.Display();
       
      
        System.out.println(b.BSearch(pri, 7));// must sorted array (Asort)*/
       
        
        node.Lch=new Node(1);
        node.item=4;

        bt.InOrder(node);

        
        qs.quicksort(pri, 0, pri.length-1);
        qs.Display();
        hs.heap_sort(pri);
        hs.Display(pri);
        

        
      int[] arri=new int[2];
      int []arrb=new int[4];
      arrb[0]=332;
      arrb[0]=55;
      arri=arrb;
      arrb=arri;
      arri[3]=34;
        System.out.println(Arrays.toString(arrb));
      
        
      
    }

    
}
