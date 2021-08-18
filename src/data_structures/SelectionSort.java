package data_structures;
//Algorithm
//Selection Sort

public class SelectionSort {


int minInd;// index for min value or max vlaue
int temp;// to swap 
int arr[];// array to sorting it
int len;// length of array

// constractor for pass array 
public SelectionSort(int arr[]){
    this.arr=arr;
    this.len=arr.length;
}

//Ascending sort
public void Asort(){
   
  
   
    for(int i=0;i<len-1;i++){
         minInd= i;
        for(int j=minInd+1;j<len;j++){
            
            if(arr[j]<arr[minInd]){
           
             temp=arr[j];
             arr[j]=arr[minInd];
             arr[minInd]=temp;
             
            }
        }
        
    }
    
}

//Descending sort
public void Dsort(){
   
  
   
    for(int i=0;i<len-1;i++){
         minInd= i;
        for(int j=minInd+1;j<len;j++){
            
            if(arr[j]>arr[minInd]){
           
             temp=arr[j];
             arr[j]=arr[minInd];
             arr[minInd]=temp;
             
            }
        }
        
    }
    
}


public void Display(){
    System.out.print("[");
    for(int r:arr){
        System.out.print(r+",");
    }
    System.out.println("\b]");
}


    
}
