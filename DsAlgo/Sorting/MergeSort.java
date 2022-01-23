/**
 * Merge Sort
 * Concept: Divide and Conquer
 * Steps: 
 * 1. Divide the array into smaller sub-arrays
 * 2. Conquer/Merge the smaller sub-arrays in sorted order.
 * 
 * Example: 
 */
public class MergeSort {

    private static void divide(int a[], int l, int h){
        // base case
        if(l>=h) return;
        
        int mid = l + (h-l)/2;   //(l+h)/2; sometime l+h is greater than the storage size of the mid
        
        // recursive case
        divide(a, l, mid);
        divide(a, mid+1, h);
        conquer(a,l,mid,h);
        
    }
    private static void conquer(int a[], int l, int mid, int h){
        int merged[] = new int[h-l+1];
        int p1 = l;  // traking first array 
        int p2 = mid+1; // traking second array
        int i = 0; // traking merged array 
       
        while(p1 <= mid && p2 <= h){
            if(a[p1] <= a[p2]){
                merged[i] = a[p1];
                p1++;
                i++;
            }else{
                merged[i] = a[p2];
                p2++;
                i++;
            }
        }

        while(p1<= mid){
            merged[i] = a[p1];
            i++;
            p1++;
        }
        
        while(p2<= h){
            merged[i] = a[p2];
            i++;
            p2++;
        }

        for(int j=0, k=l; j<merged.length; j++, k++){
            a[k]= merged[j];
        }
    }
    public static void main(String[] args){
        int a[] = {7, 2, 1, 6, 8, 0};
        divide(a, 0, a.length-1);

        // Print
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}
