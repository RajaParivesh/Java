class Solution {
    
    // Using simple search : O(n)
    // public int search(int[] nums, int target) {
    //      for(int i=0; i<nums.length; i++){
    //          if(nums[i] == target) return i;
    //      }   
    //      return -1;
    // }
    
    // Using Binary search O(logn)  
    // Very Important (VVI) : Help taken (Re-solve it)
    public int search(int[] nums, int target) {
        int mid, left = 0, right = nums.length -1;
        while(left<=right){
            mid  = left + (right -left)/2;
            if(nums[mid] == target) return mid;
            else if(target < nums[mid]) right = mid-1;
            else left = mid +1;
        }
        return -1;
    }
}