import java.util.ArrayList;
/**
 * The MergeSort program is here. 
 *
 * @author Alexander Lin
 * @version 20190306
 */
/* Java program for Merge Sort */
class MergeSort 
{ 
    public static int count = 0;
    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void merge(ArrayList<Integer> arr, int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 

        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) {
            L[i] = arr.get(l + i); 
            count++;
        }
        for (int j=0; j<n2; ++j) {
            R[j] = arr.get(m + 1+ j); 
            count++;
        }

        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 

        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr.set(k, L[i]); 
                count++;
                i++; 
            } 
            else
            { 
                arr.set(k,R[j]); 
                count++;
                j++; 
            } 
            k++; 
        } 

        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr.set(k,L[i]); 
            count++;
            i++; 
            k++; 
        } 

        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr.set(k,R[j]); 
            count++;
            j++; 
            k++; 
        } 
    } 

    // Main function that sorts arr[l..r] using 
    // merge() 
    public void sort(ArrayList<Integer> arr, int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 

            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 

            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 

    /* A utility function to print array of size n */
    static void printArray(ArrayList<Integer>arr) 
    { 
        int n = arr.size(); 
        count++;
        for (int i=0; i<n; ++i) {
            System.out.print(arr.get(i) + " "); 
            count++;
        }
        System.out.println(); 
    } 

    public static int count(){
        return count;
    }
    // Driver method 
    public static void main(String args[]) 
    { 
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(12);
        arr.add(11);
        arr.add(13);
        arr.add(5);
        arr.add(6);
        arr.add(7);

        System.out.println("Given Array"); 
        printArray(arr); 

        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.size()-1); 

        printArray(arr); 
    } 
} 

