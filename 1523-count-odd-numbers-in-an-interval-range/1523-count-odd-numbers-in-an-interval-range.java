class Solution {
    public int countOdds(int low, int high) {
        int diff = high - low + 1; 
        if(diff%2 != 0) {
            if(low%2 != 0) return (diff/2)+1;
        }
        return diff/2;
    }
}

