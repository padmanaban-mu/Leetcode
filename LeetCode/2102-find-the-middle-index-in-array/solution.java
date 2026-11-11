class Solution {
    public int findMiddleIndex(int[] nums) {
         for(int i=0;i<nums.length;i++){
            int limit=i;
            int sumLeft=0;
            int sumRight=0;
            for(int j=0;j<limit;j++){
                sumLeft+=nums[j];
            }
            for(int j=limit+1;j<nums.length;j++){
                sumRight+=nums[j];
            }
            if(sumLeft==sumRight){
                return limit;
            }
        }
        return -1;
    }
}
