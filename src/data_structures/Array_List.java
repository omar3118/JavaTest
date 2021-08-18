//Dynamic Array

package data_structures;
import java.util.ArrayList;
public class Array_List {

    
static ArrayList<Integer> arrl=new ArrayList<Integer>();




void Add(int elm)
{ 
    if(arrl.contains(elm)){System.out.println("The Element "+elm+" exist ");return;}
    arrl.add(elm);
}




void InsertAt(int pos , int elm)
{
    if(pos<0 || pos>arrl.size()){System.out.println("Out of index");return;}
 if(arrl.contains(elm)){System.out.println("The Element "+elm+" exist ");return;}
 
 arrl.add(pos , elm);    
}



void Search(int elm)
{ int n=arrl.indexOf(elm);
   if(n!=-1)System.out.println("The Element ("+elm+") exist in ("+n+") ");
   else System.out.println("The Element ("+elm+") does not exist");
}



void DeleteAt(int pos)
{
      if(pos<0 || pos>arrl.size()){System.out.println("Out of index");return;}
    arrl.remove(pos);
   
}



void UpdateAt(int pos , int elm)
{
    
    if(pos<0 || pos>arrl.size()-1){System.out.println("Out of index");return;}
    if(arrl.contains(elm)){System.out.println("The Element "+elm+" exist ");return;}
    arrl.set(pos, elm);
    
}



void ClearAllArray()
{
    
arrl.clear();
    
}



void Print()
{
  
    System.out.println(arrl);
}



}
