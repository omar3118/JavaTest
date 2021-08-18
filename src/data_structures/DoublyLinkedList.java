package data_structures;

public class DoublyLinkedList {





    Node head;//For First Node
   Node tail;
    
    int length = -1; // length of linkedList ( from 0 to first Item )

    class Node { //inner

        double data;
        Node next; // we can make object referance is null 
        Node prev;
    }

    public void InsertAtFirst(double d) {
        Node newNode = new Node();
        newNode.data = d;

        if (length == -1) {
            newNode.next = null;
            newNode.prev=null;
           tail= head = newNode;
            
            length++;
        } else {
            
            newNode.next = head;
            head.prev=newNode;
            head = newNode;
            newNode.prev=null;
            if(length==0){
                tail=head.next;
                
            }
            length++;

        }

    }

    public void InsertAtEnd(double d) {

        Node newNode = new Node();
        newNode.data = d;

        Node n = head;
        while (n.next != null) {
            n = n.next;

        }

        n.next = newNode;
        newNode.prev=n;
        newNode.next = null;
        tail=newNode;
        length++;
    }

    public void InserAt(int p, double d) {
      if(p<0||p>(length+1)){
    System.out.println("Insert Out Of Range");
    return;
}
        
        Node newNode = new Node();
        newNode.data = d;
        if (p == 0) {
            InsertAtFirst(d);
        } else if (p == (length+1)) {
            InsertAtEnd(d);
        } else {
            Node n = head;
            for (int i = 1; i < p; i++)// go to (position-1) 
            {
                n = n.next;
            }
            newNode.next = n.next;
            n.next.prev=newNode;
            n.next = newNode;
            newNode.prev=n;
            
            length++;
        }

    }

    public void DeleteAt(int p) {
if(p<0||p>length){
    System.out.println("Delete Out Of Range");
        if(length==-1)tail=null;
    return;
}
        Node n = head;
        if (p == 0) {
            head.next.prev=null;
            head = head.next;
            
        } else {
            for (int i = 1; i < p; i++) {

                n = n.next;
            }
        
        n.next.next.prev=n;
        n.next = n.next.next;
        if(p==length){
            tail=n;
        }
        }
        length--;
    }

    public void Search(double d)// element
    {
        Node n = head;
        while (n != null) {
            if (n.data == d) {
                System.out.println("Search: True");
                return;
            }
            n = n.next;
        }
        System.out.println("Search: False");
    }

    public void Display() {

        System.out.println("[Display :");
        Node n = head;
        while (n != null) {

            System.out.print(+n.data + "  ");
            n = n.next;

        }
        System.out.println( "\nSize = " + (length + 1)+" ]");

    }
    
    public void ReverseDisplay() {

        System.out.println("[Reverse Display :");
        Node n = tail;
        
        while(n!=null){
            System.out.print(n.data+"  ");
            n=n.prev;
        }
    
        System.out.println("\nSize = " + (length + 1)+" ]");

    }
    
    

}




    

