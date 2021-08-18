package data_structures;

//Algorithm
//Insertoin Sort

public class InsertionSort {

    int key;// first element for subarray (unsorted array)
    int[]arr;
    int len;// length arr
    int sub;// starting index for subarray (sorted array)
    
    public InsertionSort(int[]arr){
        this.arr=arr;
        this.len=arr.length;
    }
    
        public void Asort() {

        for (int i = 1; i < len; i++) {

            key = arr[i];
            sub = i - 1;
            while (sub >= 0 && arr[sub] > key) {
                arr[sub + 1] = arr[sub];
                sub--;
            }
            arr[sub + 1] = key;

        }

    }
           public void Dsort() {

        for (int i = 1; i < len; i++) {

            key = arr[i];
            sub = i - 1;
            while (sub >= 0 && arr[sub] < key) {
                arr[sub + 1] = arr[sub];
                sub--;
            }
            arr[sub + 1] = key;

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
