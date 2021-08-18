package data_structures;

public class QuickSort {

    
    // Ok omar to check it show programiz.com ;🙂
    
    int length;
    int arr[];

    // For put the pivot in the right place (method to find the partition position)
    public int partition(int arr[], int l, int h) {

        int pivot = arr[h];

        int i = l - 1;

        for (int j = l; j < h; j++) {

            if (arr[j] <= pivot) {

                i++;
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;

            }

        }

        int t = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = t;

        return i + 1;

    }

    public void quicksort(int arr[], int l, int h) {

        length = h;
        this.arr = arr;

        // Base Case l==h or l>h then there is just one element
        if (l < h) {

            int q = partition(arr, l, h);

            // left subarray
            quicksort(arr, l, q - 1);
            // right subarray
            quicksort(arr, q + 1, h);

        }

    }

    public void Display() {

        System.out.print("{");
        for (int i = 0; i < length + 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("\b}");

    }
    
    
    

}
