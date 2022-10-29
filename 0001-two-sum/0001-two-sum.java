// **[Failed] :** First, I think about two point approch, but **it failed**.Because given array is **not sorted** and even you sort the array, **index of each element will change**. So, I need to think some other stragegy.

// **[Success] :** Use HashMap (Take Help from discuss) Important


class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int result[] = new int[2];
        
        for(int i=0; i<arr.length; i++){
            if(h.containsKey(target-arr[i])){
                result[0] = h.get(target-arr[i]);
                result[1] = i;
            }
            h.put(arr[i], i);
        }
        return result;
    }
}