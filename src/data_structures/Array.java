// Static Array 


package data_structures;



public class Array <T> {

    
    
   

    
   
    static int ms;

    static Object arr[];

    static int l = -1;// If array without any elements

    static {

        ms = 20;

        arr = new Object[ms];

    }

    void InsertAt(int pos, T elm) {
        int i = 0;
        for (Object x : arr) {
            if (i > l) {
                break;
            }
            if (x == (Object) elm) {
                System.out.println("The element " + elm + " exist");
                return;
            }
            i++;
        }
        int j = l;
        l++;
        if (pos < 0 || pos > ms - 1 || l == ms - 1) {
            System.out.println("The Pos (" + pos + ") is out of index");
            l--;
        } else {
            if (pos > l) {
                System.out.println("Space index in Pos (" + pos + ") Elm (" + elm + ")");
                l--;
            } else {
                while (j >= pos) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[pos] = elm;
            }
        }

    }
    
    
   
    
    
    

    void DeleteAt(int pos) {
        int j = pos;
        if (pos < 0 || pos > ms - 1 || l == ms - 1 || pos > l) {
            System.out.println("The Pos (" + pos + ") is out of index");
        } else {

            while (j < l) {
                arr[j] = arr[j + 1];
                j++;

            }
            l--;
        }

    }
    
    
    
    

    void Search(T elm) {
        int j = 0;
        while (j <= l) {
            if (arr[j] == (T)elm) {
                System.out.println("The element (" + elm + ") exist in index (" + j + ") ");
                return;
            }
            j++;
        }
        System.out.println("The element (" + elm + ") does not exist");
    }
    
    
    
    

    void UpdateAt(int pos, int elm) {

        if (pos > l) {
            System.out.println("The Pos (" + pos + ") is out of index");
            return;
        }
        arr[pos] = elm;
    }
    
    
    
    

    void Print() {
        int i = 0;
        for (Object a : arr) {

            if (i > l) {
                break;
            }

            System.out.print(a + " ");
            i++;
        }

    }
    
    
    
    
}
