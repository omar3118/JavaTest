package data_structures;

public class HeapSort {

    

public void max_heapfiy(int arr[],int n,int i){
    
    int max=i;// index of parent 
    
    int l=i*2+1;// index for left child of parent
    int r=i*2+2;// index for right child of parent
    
    if(l<n&&arr[l]>arr[max])
        max=l;
    if(r<n&&arr[r]>arr[max])
        max=r;
    
    if(max!=i){
        int tem=arr[max];
        arr[max]=arr[i];
        arr[i]=tem;
       
        max_heapfiy(arr,n,max);
    }
       
}


public void build_heap(int arr[]){
    int n=arr.length;
    for(int i=n/2-1;i>=0;i--){ // n/2-1 to treversal around all nodes without leavs
        max_heapfiy(arr,n,i);
    }
}


public void heap_sort(int arr[]){
    int n=arr.length;
    build_heap(arr);
    for(int i=n-1;i>=0;i--){
       int tem=arr[0];
       arr[0]=arr[i];
       arr[i]=tem; 
       max_heapfiy(arr,i,0);
    }
}

public void Display(int arr[]){
    
    System.out.print("[");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+",");
    }
    System.out.println("\b]");
}

    
}
