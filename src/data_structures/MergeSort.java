package data_structures;

public class MergeSort {

    
    int[]arr;// to make the array instance variable
    
    public void MS(int[]arr){
        int n=arr.length;
        
        if(n<2)// if true then there is just one element
            return;
        
        int m=n/2; // to divide the array into 2 subarray
        
        int[]l=new int [m]; // make a temprary l subarray 
        int[]r=new int [n-m]; // make a temprary r subarray
        
        for(int i=0;i<m;i++){
            l[i]=arr[i];
        }for(int i=m;i<n;i++){
            r[i-m]=arr[i];
        }
        
        MS(l);
        MS(r);
        
        Merge(arr,l,r,m,n-m);
        
     
        
    }
    
    public void Merge(int[]arr,int[]l,int[]r,int lb,int rb){
        
 

        int i=0;
        int j=0;
        int k=0;
        
        while(i<lb&&j<rb){
          if(l[i]<=r[j]) 
              arr[k++]=l[i++];
          else
              arr[k++]=r[j++];
        }
        
        while(i<lb)
    arr[k++]=l[i++];

        while(j<rb)
    arr[k++]=r[j++];

this.arr=arr;
    }
    
    
    
    public void Display(){
        
        System.out.print("[");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println("\b]");
    }
   
   
    
}
