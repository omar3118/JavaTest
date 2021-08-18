package data_structures;
class Node
{
    Node Rch;
    Node Lch;
    int item;
    public  Node(int key)
    {
       this.item=key;
       Rch=null;
       Lch=null;
       
    }
}
public class BinaryTree {


public void InOrder(Node node){
    if(node==null)return;
    InOrder(node.Lch);
    System.out.print(node.item+" ");
    InOrder(node.Rch);
    
}

public void PreOrder(Node node){
    if(node==null)return;
    System.out.print(node.item+" ");
    PreOrder(node.Lch);
    PreOrder(node.Rch);
    
}

public void PostOrder(Node node){
    if(node==null)return;
    PostOrder(node.Rch);
    PostOrder(node.Lch);
    System.out.println(node.item+" ");
    
}

    
}
