
package data_structures;

// Algorithm
//BinarySearch
//must sorted array

public class BinarySearch {
   
    int min=0;
    int max ;
    int avr;
    int index = -1;
   
    public String BSearch(int[]arr , int n ){
       max=arr.length -1;
       
        while(!(max < min))
        {
          avr=(max+min)/2;
        if(arr[avr]==n){
            index=avr;
            break;
        }
       else if(arr[avr]<n)min = avr+1;
        else max = avr-1;
    }
       
        
        return n+" in index "+index;
    }
    
   
}
