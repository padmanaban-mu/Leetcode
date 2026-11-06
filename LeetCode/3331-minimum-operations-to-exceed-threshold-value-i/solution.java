class Solution {
    public int minOperations(int[] nums, int k) {
        int less=0;
        for(int i:nums){
            if(i<k){
                less++;
            }
        }
        return less;
    }
}
