// Kadane's algorithm
// find the maximum sum contiguous sub-array from an array 
// Asked in both Amazon and Microsoft
package Amazon;

import java.util.*;

public class KadanesAlgorithm {  // Kadane's algorithm
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(kandaneAlgo(arr));
    }

	private static int kandaneAlgo(int[] arr) { // Kadane's algorithm
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            if(curSum > maxSum) maxSum = curSum;
            if(curSum < 0) curSum = 0;
        }
		return maxSum;
	}    
}
