
// Simple  LinkedList

package data_structures;

class LinkedList {

    Node head;
    
    Node tail;// from me
    
    int length = -1; // length of linkedList ( from 0 to first Item )

    class Node { //inner

        double data;
        Node next; // we can make object referance is null 
        

    }

    public void InsertAtFirst(double d) {
        Node newNode = new Node();
        newNode.data = d;

        if (length == -1) {
            newNode.next = null;
            tail=head = newNode;
            
        } else {
            newNode.next = head;
            head = newNode;
            if(length==0){
                tail=head.next;
                
            }
       
        }
         length++;
    }

    public void InsertAtEnd(double d) {

        Node newNode = new Node();
        newNode.data = d;

        Node n = head;
        while (n.next != null) {
            n = n.next;

        }

        n.next = newNode;
        newNode.next = null;
        tail=newNode;
        length++;
    }

    public void InserAt(int p, double d) {
      if(p<0||p>(length+1)){
    System.out.println("Out Of Range");
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
            n.next = newNode;
            length++;
        }

    }

    public void DeleteAt(int p) {
if(p<0||p>length ){
    System.out.println("Out Of Range");
    if(length==-1)tail=null;
    return;
}
        Node n = head;
        if (p == 0) {
          head = head.next;
            
        } else {
            for (int i = 1; i < p; i++) {

                n = n.next;
            }
        
        n.next = n.next.next;
        if(p==length){
            tail=n;
        }
        }
        length--;
    }

    public void Search(int d)// element
    {
        Node n = head;
        while (n != null) {
            if (n.data == d) {
                System.out.println("existing");
                return;
            }
            n = n.next;
        }
        System.out.println("Does not exist");
    }

    public void Display() {

        System.out.println("Display :");
        Node n = head;
        
        while (n != null) {

            System.out.print(+n.data + " / ");
            n = n.next;

        }
        System.out.println("\nPointer in : " + length + "\nSize = " + (length + 1));
      
    }
    
   
      public  void Reverse(){
            
            tail=head;
            
            Node c=head;
            Node ne=head.next;
            Node p=null;
            while(ne!=null){
                ne=c.next;
                c.next=p;
                p=c;
                c=ne;
                
            }
            
            head=p;
            
            
        }
    

}
